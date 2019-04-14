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
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class View extends JFrame{
	JLabel t1[] = new JLabel[100];
	JButton b1;
	JLabel l1,l2,l3,l4,l5,l6;
	JPanel p1,p2,p3;
	View(){
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		b1 = new JButton("Back");
		b1.addActionListener(new MyActionListener17());
		l1 = new JLabel("Name");
		l2 = new JLabel("CNIC");
		l3 = new JLabel("Contact NO");
		l4 = new JLabel("Post");
		l5 = new JLabel("Salary");
		l6 = new JLabel("Address");
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
				s = a+"	,"+r+"	,"+f+"	,"+g+"	,"+h+"	,"+b+"	,"+c+"	,"+d;
				i++;
				t.add(s);
			}
			p1.setLayout(new GridLayout(t.size(),1));
			p3.setLayout(new FlowLayout());
			for(int j = 0; j<t.size(); j++){
				t1[j] = new JLabel(t.get(j));
				p1.add(t1[j]);}	
		setSize(600,400);
		setVisible(true);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		add(p3,BorderLayout.NORTH);
		p2.add(b1);
		p3.add(l1);
		p3.add(l2);
		p3.add(l3);
		p3.add(l4);
		p3.add(l5);
		p3.add(l6);
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
	class MyActionListener17 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(b1)){
				RecordMenu bm = new RecordMenu();
				dispose();
			}
			
		}
		
	}
}
