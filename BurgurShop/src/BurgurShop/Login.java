package BurgurShop;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Login extends JFrame{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2;
	JPanel p1,p2;
	Login(){
		l1 = new JLabel("Login ID");
		l2 = new JLabel("Password");
		t1 = new JTextField();
		t2 = new JTextField();
		b1 = new JButton("Login");
		b2 = new JButton("Back");
		p1 = new JPanel(new GridLayout(2,2));
		p2 = new JPanel(new FlowLayout());
		b1.addActionListener(new MyActionListener1());
		b2.addActionListener(new MyActionListener1());
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p2.add(b1);
		p2.add(b2);
	}
	public class MyActionListener1 implements ActionListener{
		public void actionPerformed(ActionEvent e) { 
			if(e.getSource().equals(b1)){
				if(t1.getText().equals("Admin") && t2.getText().equals("admin")){
					Records r = new  Records();
					setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(null, "Wrong ID or Password");
					t1.setText(null);
					t2.setText(null);
				}
			}
			else if(e.getSource() == b2){
				welcome nm = new welcome();
				dispose();
			}
			}
	}
}