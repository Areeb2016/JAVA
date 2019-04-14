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

public class DeleteGuiC extends JFrame{
	JLabel l1;
	JTextField t1;
	JPanel p1,p2;
	JButton b1,b2;
	DeleteGuiC(){
		p1 = new JPanel();
		p2 = new JPanel();
		l1 = new JLabel("Name");
		t1 = new JTextField();
		b1 = new JButton("Delete");
		b2 = new JButton("Back");
		b1.addActionListener(new MyActionListener12());
		b2.addActionListener(new MyActionListener12());
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
	class MyActionListener12 implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource().equals(b1)){
				try{
				boolean qw = false;
				String r = t1.getText();
				ObjectOutputStream output = null;
                try {
                	ArrayList<CustomerRecord> list = readAllData();
                	for(int i = 0; i<list.size(); i++)
                		if(list.get(i).getName().equals(r)){
                			list.remove(i);
                			qw = true;
                		}
                	if(qw == false){
                		JOptionPane.showMessageDialog (null, "Nothing Found");
                		dispose();
                		DeleteGuiC bnm = new DeleteGuiC();
                	}
                	else{
                	output = new ObjectOutputStream(new FileOutputStream("Customer.ser"));
                	for(int i = 0 ; i<list.size() ; i++){
                		output.writeObject(list.get(i));
                	}
                	JOptionPane.showMessageDialog (null,"record deleted", "Information", JOptionPane.INFORMATION_MESSAGE);
                	RecordMenuC rc = new RecordMenuC();
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
				RecordMenuC rmc = new RecordMenuC();
				setVisible(false);
			}
		}
		public ArrayList<CustomerRecord> readAllData ()	{
			ArrayList<CustomerRecord> List = new ArrayList<CustomerRecord>(0);
			ObjectInputStream input = null;
			try	{
				input = new ObjectInputStream(new FileInputStream("Customer.ser"));
				boolean EOF = false;
				while(!EOF) {
					try {
						CustomerRecord myObj = (CustomerRecord) input.readObject();
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
