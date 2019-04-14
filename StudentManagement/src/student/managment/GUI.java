package student.managment;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
public class GUI extends JFrame{
    protected JPanel p1,p2;
    protected JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    protected JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    protected JButton b1,b2;
    GUI(){
        setSize(400,400);
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        p1 = new JPanel();
        p2 = new JPanel();
        b1 = new JButton("Submit");
        b2 = new JButton("Cancel");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();
        l1 = new JLabel("Student Name");
        l2 = new JLabel("Phone");
        l3 = new JLabel("Gender");
        l4 = new JLabel("Department Name");
        l5 = new JLabel("Department Location");
        l6 = new JLabel("Semester");
        l7 = new JLabel("Section");
        l8 = new JLabel("GPA");
        p1.setLayout(new GridLayout(8,2));
        p2.setLayout(new FlowLayout());
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l5);
        p1.add(t5);
        p1.add(l6);
        p1.add(t6);
        p1.add(l7);
        p1.add(t7);
        p1.add(l8);
        p1.add(t8);
        p2.add(b1);
        p2.add(b2);
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);
        b1.addActionListener(new MyActionListener());
        b2.addActionListener(new MyActionListener());
    }
    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            if(ae.getActionCommand().equals("Submit")){
                int i1 = Integer.parseInt(t6.getText());    
                long l1 = Long.parseLong(t2.getText());
                double u1 = Double.parseDouble(t8.getText());
                char c1 = t7.getText().charAt(0);
                Department d1 = new Department(t4.getText(), t5.getText());
                Student s1 = new Student(t1.getText(), t3.getText(), l1, u1, i1, c1, d1);
                s1.display();
                ObjectOutputStream output = null;
                try{
                    output = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Nida\\Desktop\\myFile.scr"));
                    output.writeObject(s1);
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(null, "Error"); 
                }   
            }
            else{
                System.exit(0);
            }
        }
    }
}