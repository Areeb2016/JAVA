package BurgurShop;
public class MyException {
	
	public MyException(){
		
	}
	 public boolean isnum(String g) {
	        try {
	            Double number = Double.parseDouble(g);
	            return true;
	        } catch (NumberFormatException exc) {
	            return false;
	        }
	    }


}
