package BurgurShop;
import java.io.Serializable;
public class EmployeeRecord extends Person implements Serializable{
	private String post;
	private double salary;
	private Address address;
	EmployeeRecord() {
		super();
	}
	EmployeeRecord(String n, long c, long i, Address e, String p, double s){
		super(n,c,i);
		address = e;
		post = p;
		salary = s;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}public void setPost(String post) {
		this.post = post;
	}public double getSalary() {
		return salary;
	}public String getPost() {
		return post;
	}public void setAddress(Address address) {
		this.address = address;
	}public Address getAddress() {
		return address;
	}
	void display(){
		super.display();
		System.out.println(post+" "+salary+" "+address.getArea()+" "+address.getStreet()+" "+address.getHno());
	}
}
