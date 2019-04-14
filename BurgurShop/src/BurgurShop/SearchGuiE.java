package BurgurShop;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class SearchGuiE extends JFrame{
	    private JPanel p1,p2;
	    private JTextField t1;
	    private JLabel l1;
	    private JButton b1,b2;
	    SearchGuiE(){
	        p1 = new JPanel();
	        p2 = new JPanel();
	        b1 = new JButton("Search");
	        b2 = new JButton("Cancel");
	        t1 = new JTextField();
	        l1 = new JLabel("Name");
	        b1.addActionListener(new MyActionListener5());
	        b2.addActionListener(new MyActionListener5());
	        p1.setLayout(new GridLayout(1,2));
	        p2.setLayout(new FlowLayout());
	        setSize(600,400);
	        setVisible(true);
	        setLayout(new BorderLayout());
	        add(p1, BorderLayout.NORTH);
	        add(p2, BorderLayout.SOUTH);
	        p1.add(l1);
	        p1.add(t1);
	        p2.add(b1);
	        p2.add(b2);   
	    }
	    class MyActionListener5 implements ActionListener{
	        public void actionPerformed(ActionEvent ae) {
	            if(ae.getActionCommand().equals("Search")){
	            	EmployeeRecord emp;
	    			try {
	    				ObjectInputStream x = new ObjectInputStream(new FileInputStream("Employee.ser"));
	    				while (true) {
	    					emp = (EmployeeRecord) x.readObject();
	    					if (emp.getName().equals(t1.getText())) {
	    						JOptionPane.showMessageDialog(new JFrame(),"Name : " + emp.getName()+ " Phone: " + emp.getContactno()+" Post "+emp.getPost()+" Salary "+emp.getSalary()); 
	    					}
	    					else{
	    						JOptionPane.showMessageDialog(null, "Nothing Found");
	    					}
	    				}
	    			}
	    			catch(Exception ex){
	    				return;
	    			}
	            }
	            else{
	                RecordMenu rm = new RecordMenu();
	                setVisible(false);
	            }
	        }
	    }
	}