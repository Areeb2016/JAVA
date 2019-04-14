package BurgurShop;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class AddGuiE extends JFrame{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JButton b1,b2;
	JPanel p1,p2;
	AddGuiE(){
		l1 = new JLabel("Name");
		l2 = new JLabel("Area");
		l3 = new JLabel("Street");
		l4 = new JLabel("House no");
		l5 = new JLabel("Contact no");
		l6 = new JLabel("CNIC");
		l7 = new JLabel("Post");
		l8 = new JLabel("Salary");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		t8 = new JTextField();
		b1 = new JButton("Submit");
		b2 = new JButton("Cancel");
		b1.addActionListener(new MyActionListener4());
		b2.addActionListener(new MyActionListener4());
		p1 = new JPanel(new GridLayout(8,2));
		p2 = new JPanel(new FlowLayout());
		setSize(600,400);
		setVisible(true);
		setLayout(new BorderLayout());
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(l4);
		p1.add(t4);
		p1.add(l5);
		p1.add(t5);
		p1.add(l6);
		p1.add(t6);
		p1.add(l7);
		p1.add(t7);
		p1.add(l8);
		p1.add(t8);
		p2.add(b1);
		p2.add(b2);
	}
	class MyActionListener4 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Submit")){   
                try{
                long l1 = Long.parseLong(t5.getText());
                long u1 = Long.parseLong(t6.getText());
                double d1 = Double.parseDouble(t8.getText());
                Address a = new Address(t3.getText(), t2.getText(), t4.getText());
                EmployeeRecord er = new EmployeeRecord(t1.getText(), l1, u1, a, t7.getText(), d1);
                er.display();
                ObjectOutputStream output = null;
                try {
                	ArrayList<EmployeeRecord> list = readAllData();
                	list.add(er);
                	output = new ObjectOutputStream(new FileOutputStream("Employee.ser"));
                	for(int i = 0 ; i<list.size() ; i++){
                		output.writeObject(list.get(i));
                	}
                	JOptionPane.showMessageDialog (null,"record saved", "Information", JOptionPane.INFORMATION_MESSAGE);
                	}
               	catch(IOException ex) {
                	System.out.println("IO Exception while opening file");
               	}
                }
                catch(InputMismatchException ex){
                	JOptionPane.showMessageDialog(null, "Wrong Input");
                }
                RecordMenu rm = new RecordMenu();
                setVisible(false);
			}
            else{
            	RecordMenu r1 = new RecordMenu();
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


