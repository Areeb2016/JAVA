package student.managment;
import java.io.Serializable;
public class Department implements Serializable{
    protected String dname, location;
    Department(){
    }
    Department(String d, String l){
        dname = d;
        location = l;
    }
    public void setDname(String name) {
        this.dname = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getDname() {
        return dname;
    }
    public String getLocation() {
        return location;
    }
}