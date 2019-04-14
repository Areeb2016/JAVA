package CriminalData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CriminalDatabase {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        File f1 = new File("Criminals.txt");
        File f2 = new File("Suspects.txt");
        System.out.println("Welcome to the Criminal Database");
        System.out.println();
        start();
        database();  
    }
    public static void start(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to login \nEnter 0 to Exit the program");
        int w = input.nextInt();
        System.out.println();
        switch(w){
            case 1:{
                login();
                break;
            }
            default:{
            	exit();
            	break;
            }
        }
    }
    public static void database()throws IOException{
    	Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to add profiles");
            System.out.println("Enter 2 to view profiles");
            System.out.println("Enter 3 to search a profile");
            System.out.println("Enter 4 to update a profile");
            System.out.println("Enter 5 to delete a profile");
            System.out.println("Enter 0 to logout");
            int a = input.nextInt();
            System.out.println();
            switch (a) {
                case 1: {
                    add();
                    break;
                }
                case 2: {
                    view();
                    break;
                }
                case 3: {
                    Search();
                    break;
                }
                case 4: {
                    update();
                    break;
                }
                case 5: {
                    delete();
                    break;
                }
                default: {
                    System.out.println("Logged out");
                    start();
                }
            }
        }
    }
    public static void login() {
        Scanner input = new Scanner(System.in);
        System.out.println("User : ");
        String user = input.next();
        System.out.println("Password : ");
        String pass = input.next();
        loginData(user, pass);
    }
    public static void loginData(String x, String y) {
        String a = "qwerty";
        String b = "123asd";
        if (x.equals(a) && y.equals(b)) {
            System.out.println("ACCESS GRANTED");
            System.out.println();
        } else {
            System.out.println("ACCESS DENIED");
            System.out.println();
            login();
        }
    }
    public static void add() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("1 to add criminal profile \n2 to add suspect profile");
        int t = input.nextInt();
        System.out.println();
        switch (t) {
            case 1: {
                criminalProfile();
                break;
            }
            case 2: {
                suspectProfile();
                break;
            }
        }
    }
    public static void criminalProfile() throws IOException {
        Scanner input = new Scanner(System.in);
        File f1 = new File("Criminals.txt");
        FileWriter fw = new FileWriter(f1, true);
        BufferedWriter bw = new BufferedWriter(fw);
        while (true) {
            System.out.println("New Criminal ");
            System.out.println("Enter ID: ");
            int id = input.nextInt();
            System.out.println("Enter Name: ");
            String name = input.next();
            System.out.println("age: ");
            int age = input.nextInt();
            System.out.println("cnic: ");
            long cnic = input.nextLong();
            System.out.println("location: ");
            String local = input.next();
            System.out.println("Affiliation: ");
            String aff = input.next();
            String all = (id + " " + name + " " + age + " " + cnic + " " + local + " " + aff);
            bw.write(all);
            bw.newLine();
            System.out.println("continue   y/n");
            String a = input.next();
            if (a.equals("n")) {
                break;
            }
        }
        bw.close();
        fw.close();
    }
    public static void suspectProfile() throws IOException {
        Scanner input = new Scanner(System.in);
        File f2 = new File("Suspects.txt");
        FileWriter fw = new FileWriter(f2, true);
        BufferedWriter bw = new BufferedWriter(fw);
        while (true) {
            System.out.println("New Suspect ");
            System.out.println("Enter ID: ");
            int id = input.nextInt();
            System.out.println("Enter Name: ");
            String name = input.next();
            System.out.println("age: ");
            int age = input.nextInt();
            System.out.println("cnic: ");
            long cnic = input.nextLong();
            System.out.println("location: ");
            String local = input.next();
            System.out.println("Affiliation: ");
            String aff = input.next();
            String all = id + " " + name + " " + age + " " + cnic + " " + local + " " + aff;
            bw.write(all);
            bw.newLine();
            System.out.println("continue  y/n");
            String a = input.next();
            if (a.equals("n")) {
                break;
            }
        }
        bw.close();
        fw.close();
    }
    public static void view() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("1 for criminal profiles \n2 for suspect profiles ");
        int t = input.nextInt();
        switch (t) {
            case 1: {
                CProfile();
                break;
            }
            case 2: {
                SProfile();
                break;
            }
        }
    }
    public static void CProfile() throws IOException {
        Scanner input = new Scanner(System.in);
        File f1 = new File("Criminals.txt");
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("ID   Name    Age      CNIC      Location    Affiliation");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
        System.out.println();
    }
    public static void SProfile() throws IOException {
        Scanner input = new Scanner(System.in);
        File f2 = new File("Suspects.txt");
        FileReader fr = new FileReader(f2);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("ID   Name    Age      CNIC      Location    Affiliation");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
        System.out.println();
    }
    public static void Search() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("1 to search for a criminal's profile \n2 to search for a suspect's profile");
        int z = input.nextInt();
        switch (z) {
            case 1: {
                CrSearch();
                break;
            }
            case 2: {
                SusSearch();
                break;
            }
        }
    }
    public static void CrSearch() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("1 for search by ID \n2 for search by Name ");
        int b = input.nextInt();
        switch (b) {
            case 1: {
                CrSearchById();
                break;
            }
            case 2: {
                CrSearchByName();
                break;
            }
        }
    }
    public static void CrSearchById() throws IOException {
        Scanner input = new Scanner(System.in);
        File f1 = new File("Criminals.txt");
        System.out.print("Enter ID to view: ");
        int id = input.nextInt();
        BufferedReader br = new BufferedReader(new FileReader(f1));
        String line = "";
        System.out.println("ID    Name    Age      CNIC     Location    Affiliation");
        while ((line = br.readLine()) != null) {
            String[] line_ = line.split("[\\s]");
            if (Integer.parseInt(line_[0]) == id) {
                System.out.println(line);
                break;
            }
        }
    }
    public static void CrSearchByName() throws IOException {
        Scanner input = new Scanner(System.in);
        File f1 = new File("Criminals.txt");
        System.out.print("Enter Name to view: ");
        String name = input.next();
        BufferedReader br = new BufferedReader(new FileReader(f1));
        String line = "";
        System.out.println("ID     Name     Age     CNIC      Location    Affiliation");
        while ((line = br.readLine()) != null) {
            String[] line_ = line.split("[\\s]");
            if (line_[1].equalsIgnoreCase(name)) {
                System.out.println(line);
                break;
            }
        }
    }
    public static void SusSearch() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("1 for search by ID \n2 for search by Name ");
        int b = input.nextInt();
        switch (b) {
            case 1: {
                SusSearchById();
                break;
            }
            case 2: {
                SusSearchByName();
                break;
            }
        }
    }
    public static void SusSearchById() throws IOException {
        Scanner input = new Scanner(System.in);
        File f2 = new File("Suspects.txt");
        System.out.print("Enter ID to view: ");
        int id = input.nextInt();
        BufferedReader br = new BufferedReader(new FileReader(f2));
        String line = "";
        System.out.println("ID Name Age CNIC    Location  Affiliation");
        while ((line = br.readLine()) != null) {
            String[] line_ = line.split("[\\s]");
            if (Integer.parseInt(line_[0]) == id) {
                System.out.println(line);
                break;
            }
        }
    }
    public static void SusSearchByName() throws IOException {
        Scanner input = new Scanner(System.in);
        File f2 = new File("Suspects.txt");
        System.out.print("Enter Name to view: ");
        String name = input.next();
        BufferedReader br = new BufferedReader(new FileReader(f2));
        String line = "";
        System.out.println("ID Name Age CNIC    Location  Affiliation");
        while ((line = br.readLine()) != null) {
            String[] line_ = line.split("[\\s]");
            if (line_[1].equalsIgnoreCase(name)) {
                System.out.println(line);
                break;
            }
        }
    }
    public static void update() {
        Scanner input = new Scanner(System.in);
        System.out.println("1 for updating a criminal's profile \n2 for updating a suspect's profile ");
        int v = input.nextInt();
        switch (v) {
            case 1: {
                CrUpdate();
                break;
            }
            case 2: {
                SusUpdate();
                break;
            }
        }
    }
    public static void CrUpdate() {
        File temp = new File("criminal_Temp.txt");
        Scanner input = new Scanner(System.in);
        File f1 = new File("Criminals.txt");
        System.out.print("Enter ID to update: ");
        int id = input.nextInt();
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f1));
        } 
        catch (IOException ex) {
            Logger.getLogger(CriminalDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line = "";
        try {
            bw = new BufferedWriter(new FileWriter(temp));
            while ((line = br.readLine()) != null) {
                String[] line_ = line.split("[\\s]");
                if (Integer.parseInt(line_[0]) == id) {
                    line = CrUpdateHelper(line_);
                    bw.write(line + "\n");
                    continue;
                }
                bw.write(line + "\n");
            }
            bw.close();
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(CriminalDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        f1.delete();
        temp.renameTo(f1);
    }
    public static String CrUpdateHelper(String[] record) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to update?\n1.Name\n2.Age\n3.Location\n4.Affiliation\nInput:");
        int option = input.nextInt();
        switch (option) {
            case 1: {
                System.out.println("Enter new Name:");
                record[1] = input.next();
                break;
            }
            case 2: {
                System.out.println("Enter new Age:");
                record[2] = input.next();
                break;
            }
            case 3: {
                System.out.println("Enter new Location:");
                record[4] = input.next();
                break;
            }
            case 4: {
                System.out.println("Enter new Affiliation:");
                record[5] = input.next();
                break;
            }
        }
        String line = "";
        for (int i = 0; i < record.length; i++) {
            line += record[i] + " ";
        }
        return line;
    }
    public static void SusUpdate() {
        File temp = new File("suspect_Temp.txt");
        Scanner input = new Scanner(System.in);
        File f2 = new File("Suspects.txt");
        System.out.print("Enter ID to update: ");
        int id = input.nextInt();
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f2));
        } 
        catch (IOException ex) {
            Logger.getLogger(CriminalDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line = "";
        try {
            bw = new BufferedWriter(new FileWriter(temp));
            while ((line = br.readLine()) != null) {
                String[] line_ = line.split("[\\s]");
                if (Integer.parseInt(line_[0]) == id) {
                    line = SusUpdateHelper(line_);
                    bw.write(line + "\n");
                    continue;
                }
                bw.write(line + "\n");
            }
            bw.close();
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(CriminalDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        f2.delete();
        temp.renameTo(f2);
    }
    public static String SusUpdateHelper(String[] record) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to update?\n1.Name\n2.Age\n3.Location\n4.Affiliation\nInput:");
        int option = input.nextInt();
        switch (option) {
            case 1: {
                System.out.println("Enter new Name:");
                record[1] = input.next();
                break;
            }
            case 2: {
                System.out.println("Enter new Age:");
                record[2] = input.next();
                break;
            }
            case 3: {
                System.out.println("Enter new Location:");
                record[4] = input.next();
                break;
            }
            case 4: {
                System.out.println("Enter new Affiliation:");
                record[5] = input.next();
                break;
            }
        }
        String line = "";
        for (int i = 0; i < record.length; i++) {
            line += record[i] + " ";
        }
        return line;
    }
    public static void delete() {
        Scanner input = new Scanner(System.in);
        System.out.println("1 to delete a criminal's profile  \n2 to delete a suspect's profile");
        int u = input.nextInt();
        switch (u) {
            case 1: {
                CDelete();
                break;
            }
            case 2: {
                SusDelete();
                break;
            }
        }
    }
    public static void CDelete() {
        File f1 = new File("Criminals.txt");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID that you want to Delete: ");
        BufferedReader br = null;
        int id = input.nextInt();
        String line = "";
        String s = "";
        try {
            br = new BufferedReader(new FileReader(f1));
            while ((line = br.readLine()) != null) {
                String[] array = line.split(" ");
                if (id == Integer.parseInt(array[0])) {
                    continue;
                } 
                s += line+"\n";
            }
            FileWriter f = new FileWriter(f1);
            f.write(s);
            f.close();
        } 
        catch (IOException ex) {
            System.out.println("No Record Found");
        }
    }
    public static void SusDelete() {
        File f2 = new File("Suspects.txt");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID that you want to Delete: ");
        BufferedReader br = null;
        int id = input.nextInt();
        String line = "";
        String s = "";
        try {
            br = new BufferedReader(new FileReader(f2));
            while ((line = br.readLine()) != null) {
                String[] array = line.split(" ");
                if (id == Integer.parseInt(array[0])) {
                    continue;
                } 
                s += line+"\n";
            }
            FileWriter f = new FileWriter(f2);
            f.write(s);
            f.close();
        } 
        catch (IOException ex) {
            System.out.println("No Record Found");
        }
    }
    public static void exit(){
    	Scanner input = new Scanner(System.in);
    	System.out.println("Exit the program    y/n");
    	String c = input.next();
    	if(c.equals("y")){
    		System.exit(0);
    	}
    	else{
    		System.out.println();
    		start();
    	}
    }
}
