import java.util.HashMap;
import java.util.TreeMap;

class Contact{
	
	long Number;
	String Name,Gender;
	
	public Contact(long number,String name,String gender) {
		
		this.Number=number;
		this.Name=name;
		this.Gender=gender;
	}
	@Override
	public String toString() {
		
		
		return "Employee Name = "+ this.Name + "\n Employee Gender =  "+ this.Gender + "\n  Employee Number = "+ this.Number +"\n"; 
		
	}
	
	
		
		
	
	
	
	
	
}

public class CollectionExample{
	
	public static void main(String args[]) {
		
		Contact c1 = new Contact(956117252,"omk","male");
		Contact c2 = new Contact(946217252,"oma","male");
		Contact c3 = new Contact(956177252,"omr","female");
		
		TreeMap<Integer,Contact> tm = new TreeMap<>();
		
			tm.put( 956117252, c1);
			tm.put(86005960,c2);
			tm.put(99233573, c3);
			
			System.out.println("Keys" + tm.keySet());
			
			System.out.println("Values" + tm.values());
			
			
		
	}
}