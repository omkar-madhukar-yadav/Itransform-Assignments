import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

class Product implements Comparable<Product>{
	
	int ID;
	String Name;
	
	public Product(int id,String name) {
		
		this.ID=id;
		this.Name=name;
		
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return Name.compareTo(o.Name);
	}
	
	@Override
	public String toString() {
		
		
		return "Product Name = "+ this.Name  + "\n  Product ID = "+ this.ID +"\n"; 
		
	}
	
	
}

public class CollectionExample2{
	
	public static void main(String args[]) {
		
		Product c1 = new Product(1,"ball");
		Product c2 = new Product(2,"male");
		Product c3 = new Product(3,"female");
		
		TreeSet<Product> tm = new TreeSet<>();
		
			tm.add(c1);
			tm.add(c2);
			tm.add(c3);
			
			for(Product c : tm)
			{
			System.out.println(c.ID + " " + c.Name);
			}
			
			
			
			
		
	}
}