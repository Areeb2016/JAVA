package HashTable;
public class Student {
	String name;
	String regNo;
	String contact;
	Student() {
	}
	Student(String n, String r, String c){
		name = n;
		regNo = r;
		contact = c;
	}
	public void setName(String name) {
		this.name = name;
	}public void setRegNo(String regNo) {
		this.regNo = regNo;
	}public void setContact(String contact) {
		this.contact = contact;
	}public String getName() {
		return name;
	}public String getRegNo() {
		return regNo;
	}public String getContact() {
		return contact;
	}
}
