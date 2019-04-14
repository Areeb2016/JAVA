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
import java.util.ArrayList;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class DeleteGui extends JFrame{
	JLabel l1;
	JTextField t1;
	JPanel p1,p2;
	JButton b1,b2;
	DeleteGui(){
		p1 = new JPanel();
		p2 = new JPanel();
		l1 = new JLabel("CNIC");
		t1 = new JTextField();
		b1 = new JButton("Delete");
		b2 = new JButton("Back");
		b1.addActionListener(new MyActionListener9());
		b2.addActionListener(new MyActionListener9());
		p1.setLayout(new GridLayout(1,1));
		p2.setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		setSize(600,400);
		setVisible(true);
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		p1.add(l1);
		p1.add(t1);
		p2.add(b1);
		p2.add(b2);
	}
	class MyActionListener9 implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource().equals(b1)){
				try{
				boolean qw = false;
				long r = Long.parseLong(t1.getText());
				ObjectOutputStream output = null;
                try {
                	ArrayList<EmployeeRecord> list = readAllData();
                	for(int i = 0; i<list.size(); i++)
                		if(list.get(i).getCnic() == r){
                			list.remove(i);
                			qw = true;
                		}
                	if(qw == false){
                		JOptionPane.showMessageDialog (null, "Nothing Found");
                		dispose();
                		DeleteGui bnm = new DeleteGui();
                	}
                	else{
                	output = new ObjectOutputStream(new FileOutputStream("Employee.ser"));
                	for(int i = 0 ; i<list.size() ; i++){
                		output.writeObject(list.get(i));
                	}
                	JOptionPane.showMessageDialog (null,"record deleted", "Information", JOptionPane.INFORMATION_MESSAGE);
                	RecordMenu rm = new RecordMenu();
                    setVisible(false);
                	}
                }
               	catch(IOException ex) {
                	System.out.println("IO Exception while opening file");
               	}
				}
				catch(InputMismatchException ex){
					JOptionPane.showMessageDialog(null, "Error, Wrong Input");
				}
			}
			else{
				RecordMenu rme = new RecordMenu();
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
