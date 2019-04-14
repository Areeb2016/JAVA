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

public class corder extends MyException implements ActionListener  {

    JFrame frame5 = new JFrame();
    JFrame frame6 = new JFrame();
    JFrame frame7 = new JFrame();
    JFrame frame8 = new JFrame();
    JFrame frame9 = new JFrame();
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JButton b1, b2, b3, b4, back, e1, e2, e3, e4, e5;
    JTextField t1;
    int price, counter, counter1, counter2, counter3, counter4;
    int co,ci,cu,cp, cy = 0;
    public corder() {
    	price = 0;
        frame5.setVisible(true);
        bread();
    }
    public void bread() {
        

        l1 = new JLabel("Select Your Bread");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Chiller", Font.BOLD, 15));
        l1.setBounds(20, 50, 1000, 30);
        frame5.add(l1);

        l2 = new JLabel("1)  ITALIAN              (Rs 120)");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Forte", Font.BOLD, 15));
        l2.setBounds(20, 80, 1000, 30);
        frame5.add(l2);

        l3 = new JLabel("2)  HONEY OAT             (Rs 110)");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Forte", Font.BOLD, 15));
        l3.setBounds(20, 110, 1000, 30);
        frame5.add(l3);

        l4 = new JLabel("3)  PARMESAN OREGANO     (Rs 100)");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Forte", Font.BOLD, 15));
        l4.setBounds(20, 140, 1000, 30);
        frame5.add(l4);

        l5 = new JLabel("4)  WHEAT                      (Rs 80)");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Forte", Font.BOLD, 15));
        l5.setBounds(20, 170, 1000, 30);
        frame5.add(l5);

        l6 = new JLabel("5)  GARLIC BREAD           (Rs 150 )");
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Forte", Font.BOLD, 15));
        l6.setBounds(20, 200, 1000, 30);
        frame5.add(l6);

        l7 = new JLabel("6)  SESAME                    (Rs 100)");
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Forte", Font.BOLD, 15));
        l7.setBounds(20, 220, 1000, 30);
        frame5.add(l7);

        l8 = new JLabel("Enter The number of Bread");
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Forte", Font.BOLD, 16));
        l8.setBounds(320, 40, 220, 26);
        

        l9 = new JLabel("");
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Forte", Font.BOLD, 14));
        l9.setBounds(320, 70, 200, 26);
        

        t1 = new JTextField(25);
        t1.setBounds(320, 100, 200, 30);
        

        back = new JButton();
        back.setText("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(450, 300, 70, 30);
        back.setVisible(true);
        back.addActionListener(this);
        

        e1 = new JButton();
        e1.setText("Next");
        e1.setBackground(Color.BLACK);
        e1.setForeground(Color.WHITE);
        e1.setBounds(450, 250, 70, 30);
        e1.addActionListener(this);
        
        frame5.setLayout(null);
        frame5.setSize(600, 400);
        frame5.setResizable(false);
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.add(l8);
        frame5.add(l9);
        frame5.add(t1);
        frame5.add(back);
        frame5.add(e1);
    }


    public void cheese() {

        frame6.setVisible(true);
        frame6.setLayout(null);
        frame6.setSize(600, 400);
        frame6.setResizable(false);
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Select Your Cheese");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Chiller", Font.BOLD, 15));
        l1.setBounds(20, 50, 1000, 30);
        frame6.add(l1);

        l2 = new JLabel("1)  CHEDDER   (Rs 50)");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Forte", Font.BOLD, 15));
        l2.setBounds(20, 80, 1000, 30);
        frame6.add(l2);

        l3 = new JLabel("2) MOZZARELLA   (Rs 65)");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Forte", Font.BOLD, 15));
        l3.setBounds(20, 110, 1000, 30);
        frame6.add(l3);

        l4 = new JLabel("3)  FRENCH        (Rs 55)");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Forte", Font.BOLD, 15));
        l4.setBounds(20, 140, 1000, 30);
        frame6.add(l4);

        l5 = new JLabel("4)  SWISS     (Rs 60)");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Forte", Font.BOLD, 15));
        l5.setBounds(20, 170, 1000, 30);
        frame6.add(l5);

        l8 = new JLabel("Enter The number of CHEESE");
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("", Font.BOLD, 14));
        l8.setBounds(320, 40, 220, 26);
        frame6.add(l8);

        l9 = new JLabel("");
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Forte", Font.BOLD, 22));
        l9.setBounds(350, 70, 200, 26);
        frame6.add(l9);

        t1 = new JTextField(25);
        t1.setBounds(320, 100, 200, 30);
        frame6.add(t1);

        b1 = new JButton();
        b1.setText("Back");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450, 300, 70, 30);
        b1.setVisible(true);
        b1.addActionListener(this);
        frame6.add(b1);

        e2 = new JButton();
        e2.setText("Next");
        e2.setBackground(Color.BLACK);
        e2.setForeground(Color.WHITE);
        e2.setBounds(450, 250, 70, 30);
        e2.addActionListener(this);
        frame6.add(e2);

    }

    public void salad() {

        frame7.setVisible(true);
        frame7.setLayout(null);
        frame7.setSize(600, 400);
        frame7.setResizable(false);
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Select Your VEG");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Chiller", Font.BOLD, 15));
        l1.setBounds(20, 50, 1000, 30);
        frame7.add(l1);

        l2 = new JLabel("1)  TOMATOS/ONIONS    (Rs 20)");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Forte", Font.BOLD, 15));
        l2.setBounds(20, 80, 1000, 30);
        frame7.add(l2);

        l3 = new JLabel("2) CUCUMBERS      (Rs 10)");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Forte", Font.BOLD, 15));
        l3.setBounds(20, 110, 1000, 30);
        frame7.add(l3);

        l4 = new JLabel("3)  LETTUCE        (Rs 5)");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Forte", Font.BOLD, 15));
        l4.setBounds(20, 140, 1000, 30);
        frame7.add(l4);

        l5 = new JLabel("4)  JALAPENOS    (Rs 15)");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Forte", Font.BOLD, 15));
        l5.setBounds(20, 170, 1000, 30);
        frame7.add(l5);

        l8 = new JLabel("Enter The number of VEG");
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("", Font.BOLD, 14));
        l8.setBounds(320, 40, 220, 26);
        frame7.add(l8);

        l9 = new JLabel("");
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Forte", Font.BOLD, 22));
        l9.setBounds(350, 70, 200, 26);
        frame7.add(l9);

        t1 = new JTextField(25);
        t1.setBounds(320, 100, 200, 30);
        frame7.add(t1);

        b2 = new JButton();
        b2.setText("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(450, 300, 70, 30);
        b2.setVisible(true);
        b2.addActionListener(this);
        frame7.add(b2);

        e3 = new JButton();
        e3.setText("Next");
        e3.setBackground(Color.BLACK);
        e3.setForeground(Color.WHITE);
        e3.setBounds(450, 250, 70, 30);
        e3.addActionListener(this);
        frame7.add(e3);
    }

    public void dressing() {

        frame8.setVisible(true);
        frame8.setLayout(null);
        frame8.setSize(600, 400);
        frame8.setResizable(false);
        frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Select Your DRESSING");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Chiller", Font.BOLD, 15));
        l1.setBounds(20, 50, 1000, 30);
        frame8.add(l1);

        l2 = new JLabel("1)  HONEY MUSTARD    (Rs 10)");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Forte", Font.BOLD, 15));
        l2.setBounds(20, 80, 1000, 30);
        frame8.add(l2);

        l3 = new JLabel("2) THOUSAND ISLAND  (Rs 15)");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Forte", Font.BOLD, 15));
        l3.setBounds(20, 110, 1000, 30);
        frame8.add(l3);

        l4 = new JLabel("3)  RANCH          (Rs 20)");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Forte", Font.BOLD, 15));
        l4.setBounds(20, 140, 1000, 30);
        frame8.add(l4);

        l5 = new JLabel("4)  BBQ        (Rs 15)");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Forte", Font.BOLD, 15));
        l5.setBounds(20, 170, 1000, 30);
        frame8.add(l5);

        l8 = new JLabel("Enter The number of DRESSING");
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("", Font.BOLD, 14));
        l8.setBounds(320, 40, 220, 26);
        frame8.add(l8);

        l9 = new JLabel("");
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Forte", Font.BOLD, 22));
        l9.setBounds(350, 70, 200, 26);
        frame8.add(l9);

        t1 = new JTextField(25);
        t1.setBounds(320, 100, 200, 30);
        frame8.add(t1);

        b3 = new JButton();
        b3.setText("Back");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(450, 300, 70, 30);
        b3.setVisible(true);
        b3.addActionListener(this);
        frame8.add(b3);

        e4 = new JButton();
        e4.setText("Next");
        e4.setBackground(Color.BLACK);
        e4.setForeground(Color.WHITE);
        e4.setBounds(450, 250, 70, 30);
        e4.addActionListener(this);
        frame8.add(e4);
    }

    public void fillet() {

        frame9.setVisible(true);
        frame9.setLayout(null);
        frame9.setSize(600, 400);
        frame9.setResizable(true);
        frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Select Your Fillet");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Chiller", Font.BOLD, 15));
        l1.setBounds(20, 50, 1000, 30);
        frame9.add(l1);

        l2 = new JLabel("1)  GRILLED CHICKEN   (Rs 70)");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Forte", Font.BOLD, 15));
        l2.setBounds(20, 80, 1000, 30);
        frame9.add(l2);

        l3 = new JLabel("2)  HAM              (Rs 90)");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Forte", Font.BOLD, 15));
        l3.setBounds(20, 110, 1000, 30);
        frame9.add(l3);

        l4 = new JLabel("3)  ROAST BEEF      (Rs 65)");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Forte", Font.BOLD, 15));
        l4.setBounds(20, 140, 1000, 30);
        frame9.add(l4);

        l5 = new JLabel("4)  CHICKEN CHILLI      (Rs 80)");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Forte", Font.BOLD, 15));
        l5.setBounds(20, 170, 1000, 30);
        frame9.add(l5);

        l8 = new JLabel("Enter The number of FILLET");
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("", Font.BOLD, 14));
        l8.setBounds(320, 40, 220, 26);
        frame9.add(l8);

        l9 = new JLabel("");
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Forte", Font.BOLD, 22));
        l9.setBounds(350, 70, 200, 26);
        frame9.add(l9);

        t1 = new JTextField(25);
        t1.setBounds(320, 100, 200, 30);
        frame9.add(t1);

        b4 = new JButton();
        b4.setText("Back");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(450, 300, 70, 30);
        b4.setVisible(true);
        b4.addActionListener(this);
        frame9.add(b4);

        e5 = new JButton();
        e5.setText("Next");
        e5.setBackground(Color.BLACK);
        e5.setForeground(Color.WHITE);
        e5.setBounds(450, 250, 70, 30);
        e5.addActionListener(this);
        frame9.add(e5);
    }

 
    public void click() {
        String r = t1.getText();
        boolean p = isnum(r);
        if (p == true) {
            int n = Integer.parseInt(r);
            if (n >= 1 && n <= 6) {
                if (n == 1) {
                    price += 120;
                    l9.setText("Your bread is selected");
                    co++;
                } else if (n == 2) {
                    price += 110;
                    l9.setText("Your bread is selected");
                    co++;
                } else if (n == 3) {
                    price += 100;
                    l9.setText("Your bread is selected");
                    co++;
                } else if (n == 4) {
                    price += 80;
                    l9.setText("Your bread is selected");
                    co++;
                } else if (n == 5) {
                    price += 150;
                    l9.setText("Your bread is selected");
                    co++;
                } else {
                    price += 100;
                    l9.setText("Your bread is selected");
                    co++;
                }
            } else {
                l9.setText("select the correct bread no");
            }
        } 
        
        else {
            l9.setText("Must enter a valid Bread no");
        }
        t1.setText("");
    }

    public void click1() {
        String r = t1.getText();
        boolean p = isnum(r);
        if (counter < 4) {
            if (p == true) {
                int n = Integer.parseInt(r);
                if (n >= 1 && n <= 6) {
                    if (n == 1) {
                        price = price + 50;
                        l9.setText("Your Cheese is selected");
                        counter++;
                        ci++;
                    } else if (n == 2) {
                        price = price + 60;
                        l9.setText("Your Cheese is selected");
                        counter++;
                        ci++;
                    } else if (n == 3) {
                        price = price + 45;
                        l9.setText("Your Cheese is selected");
                        counter++;
                        ci++;
                    } else if (n == 4) {
                        price = price + 65;
                        l9.setText("Your Cheese is selected");
                        counter++;
                        ci++;
                    } else {
                        l9.setText("select the correct Cheese no");
                    }
                } else {
                    l9.setText("Must enter a valid Cheese no");
                }
            } else {
                l9.setText("Not enough Space for more Cheese");
            }
            t1.setText("");
        }
    }

    public void click2() {
        String r = t1.getText();
        boolean p = isnum(r);

        if (counter1 < 6) {
            if (p == true) {
                int n = Integer.parseInt(r);
                if (n >= 1 && n <= 6) {
                    if (n == 1) {
                        price = price + 20;
                        l9.setText("Your vegetable is selected");
                        counter1++;
                        cu++;
                    } else if (n == 2) {
                        price = price + 10;
                        l9.setText("Your vegetable is selected");
                        counter1++;
                        cu++;
                    } else if (n == 3) {
                        price = price + 5;
                        l9.setText("Your vegetable is selected.");
                        counter1++;
                        cu++;
                    } else if (n == 4) {
                        price = price + 15;
                        l9.setText("Your vegetable is selected");
                        counter1++;
                        cu++;
                    }
                } else {
                    l9.setText("select the correct Vegetable no");
                }
            } else {
                l9.setText("Must enter a valid Vegetable no");
            }
        } else {
            l9.setText("Not enough Space for more Vegetable");
        }
        t1.setText("");

    }

    public void click3() {
        String r = t1.getText();
        boolean p = isnum(r);

        if (counter2 < 2) {
            if (p == true) {
                int n = Integer.parseInt(r);
                if (n >= 1 && n <= 6) {
                    if (n == 1) {
                        price = price + 80;
                        l9.setText("Your Fillet is selected");
                        counter2++;
                        cp++;
                    } else if (n == 2) {
                        price = price + 70;
                        l9.setText("Your Fillet is selected");
                        counter2++;
                        cp++;
                    } else if (n == 3) {
                        price = price + 90;
                        l9.setText("Your Fillet is selected");
                        counter2++;
                        cp++;
                    } else if (n == 4) {
                        price = price + 65;
                        l9.setText("Your Fillet is selected");
                        counter2++;
                        cp++;
                    }

                } else {
                    l9.setText("select the correct Fillet no");
                }
            } else {
                l9.setText("Must enter a valid Fillet no");
            }
        } else {
            l9.setText("Not enough Space for more Fillet");
        }
        t1.setText("");
    }

    public void click4() {
        String r = t1.getText();
        boolean p = isnum(r);

        if (counter3 < 6) {
            if (p == true) {
                int n = Integer.parseInt(r);
                if (n >= 1 && n <= 6) {
                    if (n == 1) {
                        price = price + 10;
                        l9.setText("Your Dressing is selected");
                        counter3++;
                        cy++;
                    } else if (n == 2) {
                        price = price + 15;
                        l9.setText("Your Dressing is selected");
                        counter3++;
                        cy++;
                    } else if (n == 3) {
                        price = price + 20;
                        l9.setText("Your Dressing is selected");
                        counter3++;
                        cy++;
                    } else if (n == 4) {
                        price = price + 10;
                        l9.setText("Your Dressing is selected");
                        counter3++;
                        cy++;
                    }

                } else {
                    l9.setText("select the correct Dressing no");
                }
            } else {
                l9.setText("Must enter a valid Dressing no");
            }
        } else {
            l9.setText("Not enough Space for more Dressing");
        }
        t1.setText("");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == e1) {
            click();
            if(co == 1){
            	frame5.dispose();
            	cheese();
            }
        }
        if (e.getSource() == back) {
                frame5.setVisible(false);
                CustomerLogin cl = new CustomerLogin();
            }
         if (e.getSource() == e2) {
            click1();
            if(ci == 1){
            	salad();
            	frame6.setVisible(false);
            }
        }
          if (e.getSource() == b1) {
        	  co = 0;
        	  frame6.dispose();
        	  bread();
        }
           if (e.getSource() == e3) {
            click2();
            if(cu == 1){
            	frame7.dispose();
            	dressing();
            }
        }
          if (e.getSource() == b2) {
        	  ci = 0;
        	  frame7.dispose();
        	  cheese();
        }
          if (e.getSource() == e4) {
            click4();
            if(cy == 1){
            	frame8.dispose();
            	fillet();
            }
        }
          if (e.getSource() == b3) {
        	  frame8.dispose();
             salad();
        }  
        if(e.getSource() == e5){
        	click3();
        	if(cp == 1){
        		frame9.dispose();
        	 customeradd c=new customeradd();
             c.f2.setVisible(true);
        	}
        }
        if (e.getSource() == b4) {
        	frame9.dispose();
            dressing();
        }
    }
    public class customeradd implements ActionListener {
        JFrame f2 = new JFrame();
       
        JButton b1,b2;
        JLabel l1, l2,name,cnic,phno,l3;
        JTextField namet,cnict,phnot;
        ImageIcon i1, i2;
        public customeradd(){
            f2.setVisible(true);
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
            
                   

            f2.setLayout(null);
            f2.setSize(600, 400);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f2.add(cnic);
            f2.add(name);
            f2.add(cnict);
            f2.add(b1);
            f2.add(namet);
            f2.add(phno);
            f2.add(phnot);
            f2.add(b2);

       
       }
       
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                 f2.setVisible(false);
                 corder cv = new corder();
                 cv.frame5.setVisible(true);
                
            }
             if (e.getSource() == b2) {  
                     try{
                     long l1 = Long.parseLong(cnict.getText());
                     long u1 = Long.parseLong(phnot.getText());
                     CustomerRecord cr = new CustomerRecord(namet.getText(), l1, u1, price);
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
                     f2.dispose();
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
