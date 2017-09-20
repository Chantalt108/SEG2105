
public class Address {
	
	private String street ;
	
	
	private int number;
	
	private String postal ;
	
	
	Address (String street, int number, String postal  ){
		
		
		this.street= street;
		
		this.number = number;
		
		
		this.postal = postal;
		
		
	} // constructors and variables

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	} 

}
