package student.managment;
import java.io.Serializable;
public class Person implements Serializable{
    protected String name, gender;
    protected long phone;
    Person(){    
    }
    Person(String n, String g, long p){
        name = n;
        gender = g;
        phone = p;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public long getPhone() {
        return phone;
    }
    void display(){
        System.out.println(name+" "+phone+" "+gender);
    }
}