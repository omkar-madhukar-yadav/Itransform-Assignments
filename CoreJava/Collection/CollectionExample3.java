import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

class People implements Comparable<People>{
	
	Integer ID;
	String Name,Dept;
	double Sal;
	
	public People(int id,String name,String dept,double sal) {
		
		this.ID=id;
		this.Name=name;
		this.Dept=dept;
		this.Sal=sal;
		
	}

	@Override
	public int compareTo(People o) {
		// TODO Auto-generated method stub
		return ID.compareTo(o.ID);
	}
	
	@Override
	public String toString() {
		
		
		return "Product Name = "+ this.Name  + "\n  Product ID = "+ this.ID +"\n"; 
		
	}
	
	
}

public class CollectionExample3{
	
	public static void main(String args[]) {
		
		People c1 = new People(1,"omk","sales",2000.3);
		People c2 = new People(2,"sur","hr",2000.54);
		People c3 = new People(3,"ind","test",2000.44);
		
		TreeSet<People> tm = new TreeSet<>();
		
			tm.add(c1);
			tm.add(c2);
			tm.add(c3);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the employee id u want  ");
			int chid= sc.nextInt();
			boolean b=false;
			for(People c : tm)
			{
				if(c.ID==chid)
				{
					System.out.println(c.ID + " " + c.Name + " "+ c.Dept +" "+ c.Sal);
					b=true;
				}
				
					
				
			}
			
			if(b==false)
			{
				System.out.println("Incorrect Employee ID");
			}
			
			
		
	}
}