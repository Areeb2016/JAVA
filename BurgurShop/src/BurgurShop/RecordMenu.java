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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class RecordMenu extends JFrame{
	JPanel p1,p2;
	JButton b1,b2,b3,b4,b5,b6,b7;
	RecordMenu(){
		p1 = new JPanel(new GridLayout(5,1));
		p2 = new JPanel(new FlowLayout());
		b1 = new JButton("Add New Record");
		b2 = new JButton("Update a Record");
		b3 = new JButton("View Records");
		b4 = new JButton("Search a Record");
		b5 = new JButton("Delete the Record");
		b6 = new JButton("Logout");
		b7 = new JButton("Back");
		b1.addActionListener(new MyActionListener3());
		b2.addActionListener(new MyActionListener3());
		b3.addActionListener(new MyActionListener3());
		b4.addActionListener(new MyActionListener3());
		b5.addActionListener(new MyActionListener3());
		b6.addActionListener(new MyActionListener3());
		b7.addActionListener(new MyActionListener3());
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);	
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p2.add(b6);
		p2.add(b7);
}
class MyActionListener3 implements ActionListener{
		public void actionPerformed(ActionEvent e) { 
				if(e.getSource().equals(b1)){
					AddGuiE ag = new AddGuiE();
					dispose();
				}
				else if(e.getSource() == b2){
					UpdateGui ug = new UpdateGui();
					dispose();
				}
				else if(e.getSource().equals(b3)){
					View v= new View();
					dispose();
					/*try{
					String s;
					ArrayList<String> t = new ArrayList<String>();
					String a,b,c,d,r,f,g,h;
					ArrayList<EmployeeRecord> list = readAllData();
					int i = 0;
					while(i<list.size()){
						a = list.get(i).getName();
						b = list.get(i).getAddress().getArea();	
						c = list.get(i).getAddress().getStreet();	
						d = list.get(i).getAddress().getHno();	
						r = Long.toString(list.get(i).getCnic());	
						f = Long.toString(list.get(i).getContactno());	
						g = list.get(i).getPost();
						h = Double.toString(list.get(i).getSalary());
						s = a+" "+b+" "+c+""+d+" "+r+" "+f+" "+g+" "+h;
						i++;
						t.add(s);
					}
					JOptionPane.showMessageDialog(new JFrame(), t+"\n");
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Error");
				}*/
				}
				else if(e.getSource().equals(b4)){
					SearchGuiE sg = new SearchGuiE();
					dispose();
				}
				else if(e.getSource().equals(b5)){
					DeleteGui de = new DeleteGui();
					dispose();
				}
				else if(e.getSource().equals(b6)){
					Login lo = new Login();
					dispose();
				}
				else{
					Records rs = new Records();
					dispose();
				}
		}
		/*public ArrayList<EmployeeRecord> readAllData ()	{
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
		}*/
	}
}


