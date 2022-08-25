package assignment.springcore.assignment.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Customer {

//	@Autowired
	Address address;
	
	
	
	int Customerid; 
	String CustomerName , CustomerAddress;
	long CustomerContact;
	public Customer(Address add) {
		super();
		Customerid = 12;
		CustomerName = "OMKAR";
		CustomerAddress = "ABC";
		CustomerContact = 95611725;
		address = add;
	}
	
	public void Display() {
		
		System.out.println( this.CustomerName +" " + this.Customerid +" " + this.CustomerAddress +" \n" + " " + address.Street + " "+ address.City  
				+ " " + address.State + " " + address.County + " " + address.Zip);
	}
	
}
