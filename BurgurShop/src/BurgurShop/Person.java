package BurgurShop;
import java.io.Serializable;
public class Person implements Serializable{
	private String name;
	private long contactno, cnic;
	Person(){
	}
	Person(String n, long c, long i){
		name = n;
		contactno = c;
		cnic = i;
	}
	public void setName(String name) {
		this.name = name;
	}public void setContactno(long contactno) {
		this.contactno = contactno;
	}public void setCnic(long cnic) {
		this.cnic = cnic;
	}public String getName() {
		return name;
	}public long getContactno() {
		return contactno;
	}public long getCnic() {
		return cnic;
	}
	void display(){
		System.out.print(name+" "+cnic+" "+contactno+" "+" ");
	}
}