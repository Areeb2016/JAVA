package BurgurShop;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class SearchGuiC extends JFrame{
	    private JPanel p1,p2;
	    private JTextField t1;
	    private JLabel l1;
	    private JButton b1,b2;
	    SearchGuiC(){
	        p1 = new JPanel();
	        p2 = new JPanel();
	        b1 = new JButton("Search");
	        b2 = new JButton("Cancel");
	        t1 = new JTextField();
	        l1 = new JLabel("Name");
	        b1.addActionListener(new MyActionListener13());
	        b2.addActionListener(new MyActionListener13());
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
	    class MyActionListener13 implements ActionListener{
	        public void actionPerformed(ActionEvent ae) {
	            if(ae.getActionCommand().equals("Search")){
	            	CustomerRecord cs;
	    			try {
	    				ObjectInputStream x = new ObjectInputStream(new FileInputStream("Customer.ser"));
	    				while (true) {
	    					cs = (CustomerRecord) x.readObject();
	    					if (cs.getName().equals( t1.getText())) {
	    						JOptionPane.showMessageDialog(new JFrame(),"Name : " + cs.getName()+ " Phone: " + cs.getContactno()+" Bill "+cs.getBill()); 
	    					}
	    				}
	    			}
	    			catch(Exception ex){
	    				return;	    			}
	            }
	            else{
	                RecordMenuC rmc = new RecordMenuC();
	                setVisible(false);
	            }
	        }
	    }
	}