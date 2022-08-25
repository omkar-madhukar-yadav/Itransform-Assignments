package assignment.springcore.assignment.springcore;

import org.springframework.stereotype.Component;

//@Component
public class Address {

	String Street, City, State, County;
	int Zip;
	
	public Address() {
		super();
		Street = "Ganga";
		City = "KOP";
		State = "GOA";
		County = "India";
		Zip = 416012;
	}
	
	
}
