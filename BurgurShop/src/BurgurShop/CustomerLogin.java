package BurgurShop;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CustomerLogin implements ActionListener{
	JFrame frame1=new JFrame();
    JButton deals,cb,back;
    JLabel l1,l2;
    ImageIcon i1,i2;
    public CustomerLogin(){
        frame1.setVisible(true);
        menuframe();   
    }
    public void menuframe(){    
        l1 = new JLabel("WELCOME TO THE BURGER SHOP");
        l1.setBounds(120, 20, 400, 100);
        l1.setFont(new Font("", Font.BOLD, 20));
        l1.setForeground(Color.WHITE);        
        deals= new JButton();
        deals.setText("DEALS");
        deals.setBackground(Color.BLACK);
        deals.setBounds(80, 120, 150, 40);
        deals.addActionListener(this);
        deals.setForeground(Color.WHITE);         
        cb= new JButton();
        cb.setText("customize order");
        cb.setBackground(Color.BLACK);
        cb.setBounds(340, 120, 150, 40);
        cb.addActionListener(this);
        cb.setForeground(Color.WHITE);        
        back = new JButton();
        back.setText("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(450, 300, 70, 30);
        back.addActionListener(this);        
        l2 = new JLabel();
        l2.setIcon(i2);
        l2.setBounds(0, 0, 600, 400);
        frame1.setLayout(null);
        frame1.setSize(600, 400);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.getContentPane().setBackground(Color.GREEN);
        frame1.add(cb);
        frame1.add(back);
        frame1.add(deals);
        frame1.add(l2);
        frame1.add(l1);
    }
     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            frame1.dispose();
            welcome w = new welcome();
        }
        else if (e.getSource()==cb){
            frame1.setVisible(false);
            corder c=new corder();    
        }
        else if (e.getSource()==deals){
            frame1.setVisible(false);
            deals d=new deals();
            d.frame2.setVisible(true);
        }
     }   
}
