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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class ViewC extends JFrame{
	JLabel t1[] = new JLabel[100];
	JButton b1;
	JLabel l1,l2,l3,l4;
	JPanel p1,p2,p3;
	ViewC(){
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		b1 = new JButton("Back");
		b1.addActionListener(new MyActionListener19());
		l1 = new JLabel("Customer Records");
			String s;
			ArrayList<String> t = new ArrayList<String>();
			String a,b,c,d,r,f,g,h;
			ArrayList<CustomerRecord> list = readAllData();
			JTable Table_Records = new JTable();
			String[] Header = {"Name","CNIC","Contact Number","Bill Price"};
			DefaultTableModel DM = new DefaultTableModel(Header,0);
			Object[] O = new Object[4];
			for(int i=0;i<list.size();i++){
				O[0] = list.get(i).getName();
				O[1] = list.get(i).getCnic();
				O[2] = list.get(i).getContactno();
				O[3] = list.get(i).getBill();
				DM.addRow(O);
			}
			Table_Records.setModel(DM);
			JScrollPane Scroll  = new JScrollPane(Table_Records);
//			int i = 0;
//			while(i<list.size()){
//				a = list.get(i).getName();	
//				r = Long.toString(list.get(i).getCnic());	
//				f = Long.toString(list.get(i).getContactno());	
//				g = Double.toString(list.get(i).getBill());
//				s = a+"	,"+r+"	,"+f+"	,"+g;
//				i++;
//				t.add(s);
//			}
//			p1.setLayout(new GridLayout(t.size(),1));
//			p3.setLayout(new FlowLayout());
//			for(int j = 0; j<t.size(); j++){
//				t1[j] = new JLabel(t.get(j));
//				p1.add(t1[j]);}	
		p1.add(Scroll);
		setSize(600,400);
		setVisible(true);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		add(p3,BorderLayout.NORTH);
		p2.add(b1);
		p3.add(l1);
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
	class MyActionListener19 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(b1)){
				RecordMenuC bmc = new RecordMenuC();
				dispose();
			}
			
		}
		
	}
}