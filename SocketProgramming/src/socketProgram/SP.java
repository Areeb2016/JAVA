package socketProgram;
import java.net.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
public class SP{
   public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       String site = input.nextLine();
	   Socket s = new Socket(InetAddress.getByName(site), 80);
       PrintWriter w = new PrintWriter(s.getOutputStream());
       w.print("GET / HTTP/1.1\r\n");
       w.println();
       w.print("Host: " + site + "\r\n\r\n");
       w.println();
       w.flush();
       BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
       String b;
       while ((b = br.readLine()) != null) 
           System.out.println(b);
       br.close();
       JEditorPane editor = new JEditorPane();
       editor.setEditable(false);
       try {
       	  editor.setPage("https://www."+site);
       }
       catch (IOException e) {
       	  editor.setContentType("text/html");
       	  editor.setText("<html>Could not load</html>");
       } 
       JScrollPane scroll = new JScrollPane(editor);
       JFrame frame  = new JFrame(site);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().add(scroll);
       frame.setSize(800, 600);
       frame.setVisible(true);    
   }
}
