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
public class RecordMenuC extends JFrame{
		JPanel p1,p2;
		JButton b2,b3,b4,b5,b6,b7;
		RecordMenuC(){
			p1 = new JPanel(new GridLayout(5,1));
			p2 = new JPanel(new FlowLayout());
			b2 = new JButton("Update a Record");
			b3 = new JButton("View Records");
			b4 = new JButton("Search a Record");
			b5 = new JButton("Delete the Record");
			b6 = new JButton("Logout");
			b7 = new JButton("Back");
			b2.addActionListener(new MyActionListenerC2());
			b3.addActionListener(new MyActionListenerC2());
			b4.addActionListener(new MyActionListenerC2());
			b5.addActionListener(new MyActionListenerC2());
			b6.addActionListener(new MyActionListenerC2());
			b7.addActionListener(new MyActionListenerC2());
			setSize(600,400);
			setVisible(true);
			setLayout(new BorderLayout());
			add(p1, BorderLayout.CENTER);
			add(p2, BorderLayout.SOUTH);
			p1.add(b2);
			p1.add(b3);
			p1.add(b4);
			p1.add(b5);
			p2.add(b6);
			p2.add(b7);
	}
	class MyActionListenerC2 implements ActionListener{
			public void actionPerformed(ActionEvent e) { 
				try{
					if(e.getSource().equals(b2)){
						UpdateGuiC updc = new UpdateGuiC();
						setVisible(false);
					}
					else if(e.getSource().equals(b3)){
						ViewC vc= new ViewC();
						dispose();
					}
						
					else if(e.getSource().equals(b4)){
						SearchGuiC sgc = new SearchGuiC();
						setVisible(false);
					}
					else if(e.getSource().equals(b5)){
						DeleteGuiC dgc = new DeleteGuiC();
						setVisible(false);
					}
					else if(e.getSource().equals(b6)){
						Login li = new Login();
						setVisible(false);
					}
					else{
						Records rd = new Records();
						setVisible(false);
					}
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "System Fault");
				}
			}
	}
	}