import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Order{
	
	public double Cost;
	String Name,Status;
	
	public Order(String name,double cost,String status) {
		
		this.Cost=cost;
		this.Name=name;
		
	}
	
	

	
	
	public double getCost() {
		return Cost;
	}





	public void setCost(double cost) {
		Cost = cost;
	}





	public String getName() {
		return Name;
	}





	public void setName(String name) {
		Name = name;
	}





	public String getStatus() {
		return Status;
	}





	public void setStatus(String status) {
		Status = status;
	}





	@Override
	public String toString() {
		
		
		return "Product Name = "+ this.Name  + "\n  Product COST = "+ this.Cost +"\n"; 
		
	}
	
}

class lambdaExampleTwo{
	
	public static void main(String args[]) {
		
		List<Order> product = Arrays.asList(
			new Order("TV",2000,"ACC"),
			new Order("FRIDGE",5000,"COM"),
			new Order("FAN",1500,"COM")
				);
		
		display(product, p ->  p.getCost() > 1000  ); 
		
		
		
				
	}
	
	private static void display(List<Order> product,Predicate<Order> c) {
		for(Order o : product) {
			if(c.test(o))
			System.out.println(o);
		}	
		
	}
}