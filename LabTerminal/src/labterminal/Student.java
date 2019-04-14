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
public class Student {
    
    private String regNo;
    private String name;
    private String contact;

    public Student() {
    }

    public Student(String regNo, String name, String contact) {
        this.regNo = regNo;
        this.name = name;
        this.contact = contact;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    
    
    
    
}
