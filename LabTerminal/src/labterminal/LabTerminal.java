/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labterminal;

/**
 *
 * @author moham
 */
public class LabTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BST data = new BST();
        
        Student s1 = new Student("FA16-BCS-053","Adil Mughal","03345056112");
        data.insert(s1);
        Student s2 = new Student("FA16-BCS-051","Umer Shakeel","03345088642");
        data.insert(s2);
        Student s3 = new Student("FA16-BCS-052","Ghulam Meeran","0154566233");
        data.insert(s3);
        Student s4 = new Student("FA16-BCS-050","New Student","0154566233");
        data.insert(s4);
        
        Student st = BST.find("fa16-bcs-053");
        System.out.println(st.getName());
        
        data.display();
        
    }
    
    
}
