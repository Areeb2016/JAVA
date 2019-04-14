package student.managment;
import java.io.Serializable;
public class Student extends Person implements Serializable{
    protected double gpa;
    protected int semester;
    protected char section;
    protected Department dep;
    Student(){
        super();
    }
    Student(String n, String g, long p, double a, int s, char e, Department r){
        super(n,g,p);
        gpa = a;
        semester = s;
        section = e;
        dep = r;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public void setSection(char section) {
        this.section = section;
    }
    public double getGpa() {
        return gpa;
    }
    public char getSection() {
        return section;
    }
    public int getSemester() {
        return semester;
    }
    public void setDep(Department dep) {
        this.dep = dep;
    }
    public Department getDep() {
        return dep;
    }
    void display(){
        super.display();
        System.out.println(semester+" "+section+" "+gpa+" "+dep.dname+" "+dep.location);
    }
}