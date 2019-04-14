package BurgurShop;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class welcome implements ActionListener {
    JFrame frame=new JFrame();
    JButton admin,customer,back;
    JLabel l1,l2;
    ImageIcon i1,i2;
    public welcome(){
        frame.setVisible(true);
        wframe();
    }
    public void wframe(){
        l1 = new JLabel("WELCOME TO THE BURGER SHOP");
        l1.setBounds(120, 20, 400, 100);
        l1.setFont(new Font("", Font.BOLD, 20));
        l1.setForeground(Color.MAGENTA);
        admin= new JButton();
        admin.setText("Admin");
        admin.setBackground(Color.BLACK);
        admin.setBounds(80, 120, 150, 40);        
        admin.addActionListener(this);
        admin.setForeground(Color.WHITE);
        customer= new JButton();
        customer.setText("Customer");
        customer.setBackground(Color.BLACK);
        customer.setBounds(340, 120, 150, 40);
        customer.addActionListener(this);
        customer.setForeground(Color.WHITE);
        back = new JButton();
        back.setText("EXIT");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(450, 300, 70, 30);
        back.addActionListener(this);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(l1);
        frame.add(admin);
        frame.add(customer);
        frame.add(back);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            System.exit(0);
        }
        else if (e.getSource()==customer){
            frame.setVisible(false);
           CustomerLogin cl=new CustomerLogin();
        }
        else{
        	frame.setVisible(false);
        	Login log = new Login();
        }
    }
}
