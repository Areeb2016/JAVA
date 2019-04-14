package student.managment;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class newGUI extends JFrame{
    protected JPanel p1,p2;
    protected JTextField t1;
    protected JLabel l1;
    protected JButton b1,b2;
    newGUI(){
        setSize(200,200);
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        p1 = new JPanel();
        p2 = new JPanel();
        b1 = new JButton("Search");
        b2 = new JButton("Cancel");
        t1 = new JTextField();
        l1 = new JLabel("Name");
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new FlowLayout());
        p1.add(l1);
        p1.add(t1);
        p2.add(b1);
        p2.add(b2);
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);
        b1.addActionListener(new MyActionListener());
        b2.addActionListener(new MyActionListener());
    }
    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            if(ae.getActionCommand().equals("Search")){
                ObjectInputStream input = null;
                try{
                    input = new ObjectInputStream(new FileInputStream("C:\\Users\\Nida\\Desktop\\myFile.scr"));
                    try {
                        Student s1 = (Student) input.readObject();
                        if(s1.name.equals(t1.getText()))
                            JOptionPane.showMessageDialog(null, "Record Found "+s1.name);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(newGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
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