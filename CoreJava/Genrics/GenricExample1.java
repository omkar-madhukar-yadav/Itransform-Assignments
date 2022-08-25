import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Values <T,U>{
	

	
	
	public void displayDetails(HashMap<T,U> map)
	{
		System.out.println("Hashmap values " +map);
	}
}

public class GenricExample1{
	
	public static void main(String args[]) {
		Values<Integer,String> val= new Values<Integer,String>();
		
		HashMap<Integer,String> h = new HashMap<Integer,String>();	
		
		h.put(1,"om");
		h.put(2,"ka");
		h.put(3,"omk");
		h.put(4,"kar");
		h.put(5,"omka");
		h.put(6,"kara");
		h.put(7,"omy");
		h.put(8,"oka");
		h.put(9,"odsm");
		h.put(10,"dcka");
		
		
		
		val.displayDetails(h);
		
	}
}