
public class Employee {
	
	private int hours ; 
	
	private double rate ;
	
	private String name ;
	
	private Address[] address;
	
	Employee ( String name , Address[] address){
		
		this.address = address; 
		
		this.hours = 40 ;
		
		this.name = name; 
		
		//this.address = address ;
		
		this.rate = 15.50 ;
		
		
	}
	
	public Address[] getAddress() {
		return address;
	}
	public void setAddress(Address[] address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
public static void main(String[] args) {
	
		Address[] listOfAddress = new Address[5];
		
		listOfAddress [0] = new Address ("King Edward ", 800, "K1N6N5");
		
		listOfAddress [1] = new Address ( "Queen ", 48 ,"K1P1N2");
	
		Employee ol =  new Employee ("Falcao ", listOfAddress );
		
		System.out.println("Success!");
				
		
	}

	
	
	
	

}
