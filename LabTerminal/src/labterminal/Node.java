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
public class Node {
    
    Student st;
    long reg;
    Node lc;
    Node rc;
    
    public Node(Student s){
        st = s;
        reg = hash(s.getRegNo().toLowerCase());
        lc = null;
        rc = null;
    }
    
    static long hash(String s){
        long toReturn = 0;
        for(int i = 0; i<s.length(); i++){
            long num = (long) (s.charAt(i)*Math.pow(2, i));
            toReturn += num;
        }
        return toReturn;
    }
    
}