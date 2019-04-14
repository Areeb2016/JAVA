package BurgurShop;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class UpdateGui extends JFrame{
	JPanel p1, p2;
	JButton b1, b2;
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	UpdateGui(){
		p1 = new JPanel();
		p2 = new JPanel();
		l1 = new JLabel("CNIC");
		t1 = new JTextField();
		l2 = new JLabel("Post");
		t2 = new JTextField();
		l3 = new JLabel("Salary");
		t3 = new JTextField();
		b1 = new JButton("Update");
		b2 = new JButton("Back");
		p1.setLayout(new GridLayout(3,3));
		p2.setLayout(new FlowLayout());
		b1.addActionListener(new MyActionListener7());
		b2.addActionListener(new MyActionListener7());
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p2.add(b1);
		p2.add(b2);
	}

class MyActionListener7 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(b1)){
			try{
			boolean qw = false;
			long l = Long.parseLong(t1.getText());
			double d = Double.parseDouble(t3.getText());
			ObjectOutputStream output = null;
			try{
				ArrayList<EmployeeRecord> list = readAllData();
			for(int i = 0; i<list.size(); i++)
				if(list.get(i).getCnic() == l){
					list.get(i).setPost(t2.getText());
					list.get(i).setSalary(d);
					qw = true;
				}
			if(qw == false){
        		JOptionPane.showMessageDialog (null, "Nothing Found");
        		dispose();
        		UpdateGui bnm = new UpdateGui();
        	}
			else{
				output = new ObjectOutputStream(new FileOutputStream("Employee.ser"));
				for(int i = 0 ; i<list.size() ; i++)
					output.writeObject(list.get(i));
				JOptionPane.showMessageDialog (null,"record saved", "Information", JOptionPane.INFORMATION_MESSAGE);
				RecordMenu rm = new RecordMenu();
				setVisible(false);
			}
			}
			catch(IOException ex) {
				System.out.println("IO Exception while opening file");
			}
			}
			catch(InputMismatchException ex){
				return;
			}
		}
		else{
			RecordMenu rm = new RecordMenu();
			setVisible(false);
		}
	}
	public ArrayList<EmployeeRecord> readAllData ()	{
		ArrayList<EmployeeRecord> List = new ArrayList<EmployeeRecord>(0);
		ObjectInputStream input = null;
		try	{
			input = new ObjectInputStream(new FileInputStream("Employee.ser"));
			boolean EOF = false;
			while(!EOF) {
				try {
					EmployeeRecord myObj = (EmployeeRecord) input.readObject();
					List.add(myObj);
				}
				catch (ClassNotFoundException e) {
				}
				catch (EOFException end) {
					EOF = true;
				}
			}
		}
		catch(FileNotFoundException e) {
		}
		catch (IOException e) {
		}
		finally {
			try {
				if(input != null)
					input.close( );
			}
			catch (IOException e){
				System.out.println("IO Exception while closing file");
			}
		}
		return List;
	}
}	
	
}

