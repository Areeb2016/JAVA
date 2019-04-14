package BurgurShop;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Records extends JFrame{
	JPanel p1,p2,p3;
	JButton b1,b2,b3, b4;
	Records(){
		p1 = new JPanel(new FlowLayout());
		p2 = new JPanel(new FlowLayout());
		p3 = new JPanel(new FlowLayout());
		b1 = new JButton("Employee Record");
		b2 = new JButton("Customer Record");
		b4 = new JButton("Earning");
		b3 = new JButton("Logout");
		b1.addActionListener(new MyActionListener2());
		b2.addActionListener(new MyActionListener2());
		b3.addActionListener(new MyActionListener2());
		b4.addActionListener(new MyActionListener2());
		setSize(600,400);
		setVisible(true);
		setLayout(new BorderLayout());
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(p3, BorderLayout.CENTER);
		p1.add(b1);
		p1.add(b2);
		p3.add(b4);
		p2.add(b3);
	}
	class MyActionListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e) { 
			try{
			if(e.getSource().equals(b1)){
				RecordMenu r1 = new RecordMenu();
				dispose();
			}
			else if(e.getSource().equals(b2)){
				RecordMenuC r2 = new RecordMenuC();
				dispose();
			}
			else if(e.getSource().equals(b4)){
				ArrayList<EmployeeRecord> list1 = readAllData1();
				ArrayList<CustomerRecord> list2 = readAllData2();
				double a = 0;
				double b = 0;
				double c = 0;
 				for(int i = 0; i<list1.size(); i++)
					a += list1.get(i).getSalary();
				for(int i = 0; i<list2.size(); i++)
					b += list2.get(i).getBill();
				c = b-a;
				JOptionPane.showMessageDialog(new JFrame(), "Gross Earning "+ c);
			}
			else{
				Login l = new Login();
				dispose();
			}
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(null, "ERROR");
			}
		}
		public ArrayList<EmployeeRecord> readAllData1 ()	{
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
		public ArrayList<CustomerRecord> readAllData2 ()	{
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
