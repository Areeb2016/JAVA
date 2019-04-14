package BurgurShop;
import java.awt.Color;
import java.awt.Font;
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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class deals implements ActionListener {
    JFrame frame2 = new JFrame();
    JButton deal1, deal2, deal3, deal4, back,bill1;
    JLabel l1, l2;
    ImageIcon i1, i2, i3, i4, i5;
    int cnt1=0,cnt2=0,cnt3=0,cnt4=0,bill=0;
    public deals() {
        frame2.setVisible(true);
        dealframe();
    }
    public void dealframe() {
    
        i1=new ImageIcon("C:\\Users\\maida shaheen\\Documents\\BurgerShop\\src\\18002_burger_factory_main.jpg");
        i2=new ImageIcon("C:\\Users\\maida shaheen\\Documents\\BurgerShop\\src\\20399004_1071548432987205_6317351444454309888_n.jpg");
        i3=new ImageIcon("C:\\Users\\maida shaheen\\Documents\\BurgerShop\\src\\dealmenu2.jpg");
        i4=new ImageIcon("C:\\Users\\maida shaheen\\Documents\\BurgerShop\\src\\dealmenu3.jpg");
        i5=new ImageIcon("C:\\Users\\maida shaheen\\Documents\\BurgerShop\\src\\pexels-photo-268415.jpeg");
        
       frame2.setLayout(null);
       frame2.setSize(600, 400);
       frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1 = new JLabel("total bill : 0");
        l1.setBounds(450, 50, 100, 200);
        l1.setFont(new Font("", Font.BOLD, 15));
        l1.setForeground(Color.BLUE);
        frame2.add(l1);

        back = new JButton();
        back.setText("EXIT");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(480, 300, 70, 30);
         back.addActionListener(this);
        frame2.add(back);

        deal1 = new JButton();
        deal1.setText("Deal 1");
        deal1.setBackground(Color.BLACK);
        deal1.setForeground(Color.WHITE);
        deal1.setBounds(50, 20, 150, 150);
        deal1.setIcon(i1);
        deal1.addActionListener(this);
        frame2.add(deal1);

        deal2 = new JButton();
        deal2.setText("deal 2");
        deal2.setBackground(Color.BLACK);
        deal2.setForeground(Color.WHITE);
        deal2.setBounds(50, 190, 150, 150);
        deal2.setIcon(i2);
        deal2.addActionListener(this);
        frame2.add(deal2);

        deal3 = new JButton();
        deal3.setText("deal 3");
        deal3.setBackground(Color.BLACK);
        deal3.setForeground(Color.WHITE);
        deal3.setBounds(250, 20, 150, 150);
        deal3.setIcon(i3);
        deal3.addActionListener( this);
        frame2.add(deal3);

        deal4 = new JButton();
        deal4.setText("deal 4");
        deal4.setBackground(Color.BLACK);
        deal4.setForeground(Color.WHITE);
        deal4.setBounds(250, 190, 150, 150);
        deal4.setIcon(i4);
        deal4.addActionListener( this);
        frame2.add(deal4);  l2 = new JLabel();
        
        bill1 = new JButton();
        bill1.setText("Reciept");
        bill1.setBackground(Color.BLACK);
        bill1.setForeground(Color.WHITE);
        bill1.setBounds(480, 200, 70, 30);
        bill1.addActionListener(this);
        frame2.add(bill1);
        
        l2.setIcon(i5);
        l2.setBounds(0, 0, 600, 400);
        frame2.add(l2);
        
        

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == back) {
            frame2.setVisible(false);
            welcome wr = new welcome();
        }
        if (e.getSource() == deal1) {
            cnt1++;
            bill=bill+999;
              l1.setText("total bill : "+bill);
           
        }
        if (e.getSource() == deal2) {
            cnt2++;
            bill=bill+890;
              l1.setText("total bill : "+bill);
        }
        if (e.getSource() == deal3) {
            cnt3++;
            bill=bill+499;
              l1.setText("total bill : "+bill);
        }
        if (e.getSource() == deal4) {
            cnt4++;
            bill=bill+1199;
              l1.setText("total bill : "+bill);
        }
        
         if (e.getSource() == bill1) {
             System.out.println("bill"+bill);
             frame2.setVisible(false);
             customerdata c=new customerdata();
             c.fr2.setVisible(true);
             
           
        }
    }
    public class customerdata implements ActionListener {
        JFrame fr2 = new JFrame();
        JButton b1,b2;
        JLabel l1, l2,name,cnic,phno,l3;
        JTextField namet,cnict,phnot;
        ImageIcon i1, i2;
        public customerdata(){
            fr2.setVisible(true);
            dataframe();
        }
       public void dataframe(){
           
           
            b1 = new JButton();
            b1.setText("back");
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.setBounds(480, 300, 70, 30);
            b1.addActionListener(this);
            
            
            name = new JLabel("ENTER NAME : ");
            name.setBounds(20, 100, 150, 30);
            name.setFont(new Font("", Font.BOLD, 12));
            name.setForeground(Color.BLACK);
            name.setVisible(true);
            
            
            namet = new JTextField();
            namet.setBounds(220, 100, 200, 30);
            namet.setForeground(Color.GRAY);
           
            
            cnic = new JLabel("ENTER CNIC : ");
            cnic.setBounds(20, 150, 150, 30);
            cnic.setFont(new Font("", Font.BOLD, 12));
            cnic.setForeground(Color.BLACK);
            cnic.setVisible(true);
            
            
            cnict = new JTextField();
            cnict.setBounds(220, 150, 200, 30);
            cnict.setForeground(Color.GRAY);
            
            
            phno = new JLabel("ENTER PHONE NUMBER : ");
            phno.setBounds(20, 200, 150, 30);
            phno.setFont(new Font("", Font.BOLD, 12));
            phno.setForeground(Color.BLACK);
            phno.setVisible(true);
            
            
            phnot = new JTextField();
            phnot.setBounds(220, 200, 200, 30);
            phnot.setForeground(Color.GRAY);
            
            
            b2 = new JButton();
            b2.setText("reciept");
            b2.setBackground(Color.WHITE);
            b2.setBounds(390, 300, 80, 30);
            b2.addActionListener(this);
            
                   

            fr2.setLayout(null);
            fr2.setSize(600, 400);
            fr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr2.add(cnic);
            fr2.add(name);
            fr2.add(cnict);
            fr2.add(b1);
            fr2.add(namet);
            fr2.add(phno);
            fr2.add(phnot);
            fr2.add(b2);

       
       }
       
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                 fr2.setVisible(false);
                 deals de = new deals();
                 de.frame2.setVisible(true);
            }
             if (e.getSource() == b2) {  
            	     try{
                     long l1 = Long.parseLong(cnict.getText());
                     long u1 = Long.parseLong(phnot.getText());
                     CustomerRecord cr = new CustomerRecord(namet.getText(), l1, u1, bill);
                     cr.display();
                     ObjectOutputStream output = null;
                     try {
                     	ArrayList<CustomerRecord> list = readAllData();
                     	list.add(cr);
                     	output = new ObjectOutputStream(new FileOutputStream("Customer.ser"));
                     	for(int i = 0 ; i<list.size() ; i++){
                     		output.writeObject(list.get(i));
                     	}
                     	JOptionPane.showMessageDialog (null,"record saved", "Information", JOptionPane.INFORMATION_MESSAGE);
                     	}
                    	catch(IOException ex) {
                     	System.out.println("IO Exception while opening file");
                    	}
                     }
                     catch(Exception ex){
                     	JOptionPane.showMessageDialog(null, "Wrong Input");
                     }
                     JOptionPane.showMessageDialog(new JFrame(), "ThankYou for Trusting Us!");
     			welcome we = new welcome();
                     fr2.dispose();
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
