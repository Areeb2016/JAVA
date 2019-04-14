package socketProgram;
import java.io.*;
import java.util.*;
import java.net.*;
import javax.swing.*;

public class SocketP {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of your website");
        String WebsiteName = input.next();
        Socket s = new Socket(InetAddress.getByName(WebsiteName), 80);
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        pw.println("GET / HTTP/1.1\n\r\n");
        pw.println("Host:"+WebsiteName+"\n\r\n");
        pw.println("");
        pw.flush();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String t;
        while ((t = br.readLine()) != null) {
            System.out.println(t);
        }
        br.close();
        showWebsite(WebsiteName);
    }

    public static void showWebsite(String link) throws Exception {
        URL u2 = new URL("https://" + link);
        JEditorPane editor = new JEditorPane(u2);
        editor.setEditable(false);
        JScrollPane pane = new JScrollPane(editor);
        JFrame f = new JFrame("DCCN_Assign2");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(pane);
        f.setSize(800, 600);
        f.setVisible(true);
    }
}

