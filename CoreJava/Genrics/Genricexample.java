import java.util.HashSet;
import java.util.Iterator;

class Employee1 <T,U,V>{
	
	HashSet<T> set1 = new HashSet<T>();
	HashSet<U> set2 = new HashSet<U>();
	HashSet<V> set3 = new HashSet<V>();
	
	
	public Employee1(T id,U name,V sal)
	{
		set1.add(id);
		set2.add(name);
		set3.add(sal);
		
	}
	
	public void displayDetails()
	{
		Iterator<T> i= set1.iterator();  
        while(i.hasNext())  
        {
        	
        System.out.println(i.next());  
        } 
        
        Iterator<U> i1= set2.iterator();  
        while(i1.hasNext())  
        {
        	
        System.out.println(i1.next());  
        }
        
        Iterator<V> i2= set3.iterator();  
        while(i2.hasNext())  
        {
        	
        System.out.println(i2.next());  
        } 
	}
}

public class Genricexample{
	
	public static void main(String args[]) {
		Employee1<Integer,String,Double> emp= new Employee1<Integer,String,Double>(10,"om",1356.10);
		
		
		
		emp.displayDetails();
		
	}
}