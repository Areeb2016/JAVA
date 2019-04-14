package BurgurShop;
import java.io.Serializable;
public class Address implements Serializable{
	private String street, area, hno;
	Address() {	
	}
	Address(String s, String a, String h){
		street = s;
		area = a;
		hno = h;
	}
	public void setStreet(String street) {
		this.street = street;
	}public void setHno(String hno) {
		this.hno = hno;
	}public void setArea(String area) {
		this.area = area;
	}public String getStreet() {
		return street;
	}public String getHno() {
		return hno;
	}public String getArea() {
		return area;
	}
}
