/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labterminal;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author moham
 */
public class BST {

    static private Node root;

    public BST() {
        root = null;
    }

    public void insert(Student s) {
        Node a = new Node(s);
        long v = Node.hash(s.getRegNo().toLowerCase());
        if (root == null) {
            root = a;
        } else {
            Node p = root;
            Node c = root;
            while (c != null) {
                p = c;
                if (v < c.reg) {
                    c = c.lc;
                } else {
                    c = c.rc;
                }
            }
            if (v < p.reg) {
                p.lc = a;
            } else {
                p.rc = a;
            }

        }
    }

    public void display() {
        display(root);
    }

    private void display(Node c) {
        if (c == null) {
            return;
        }
        display(c.lc);
        System.out.print(c.st.getRegNo()+ "  ");
        System.out.print(c.st.getName() + " ");
        System.out.print(c.st.getContact() + " ");
        System.out.println("");
        display(c.rc);
    }

    public void remove(Student s) {
        long v = Node.hash(s.getRegNo());
        Node p, S, c, T;

        p = root;
        c = root;

        while (c.reg != v) {
            p = c;
            if (v < c.reg) {
                c = c.lc;
            } else {
                c = c.rc;
            }

            if (c == null) {
                return;
            }
        }

        if (c.lc == null && c.rc == null) {
            if (c == root) {
                root = null;
                return;
            }
            if (p.lc == c) {
                p.lc = null;
            } else {
                p.rc = null;
            }
        } else if ((c.lc == null && c.rc != null) || (c.lc != null && c.rc == null)) {
            if (c == root) {
                if (root.lc != null) {
                    root = root.lc;
                } else {
                    root = root.rc;
                }
                return;
            } else if (p.lc == c) {
                if (c.lc != null) {
                    p.lc = c.lc;
                } else {
                    p.rc = c.lc;
                }
            } else {
                if (c.lc != null) {
                    p.lc = c.lc;
                } else {
                    p.rc = c.lc;
                }
            }
        } else{
            T = c;
            S = c.rc;
            while (S.lc != null){
                T = S;
                S = S.lc;
            }
            c.reg = S.reg;
            if(T.lc == S){
                if(S.rc != null){
                    T.lc = S.rc;
                }
                else{
                    T.lc = null;
                }
            }
            else{
                T.rc = S.rc;
            }
        }
    }
    
    public static Student  find(String r){
        if(root == null){
            return null;
        }
        Node p= root;
        long reg = Node.hash(r.toLowerCase());
        while(reg != p.reg){
            if(reg < p.reg){
                p = p.lc;
            }
            else{
                p = p.rc;
            }
            
            if(p == null){
                return null;
            }
        }
        return p.st;
    }
    
    
}
