package BurgurShop;
import java.io.Serializable;
public class CustomerRecord extends Person implements Serializable{
	private double bill;
	CustomerRecord() {
		super();
	}
	CustomerRecord(String n, long c, long i, double b){
		super(n,c,i);
		bill = b;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}public double getBill() {
		return bill;
	}
	void display(){
		super.display();
		System.out.println(bill);
	}
}
