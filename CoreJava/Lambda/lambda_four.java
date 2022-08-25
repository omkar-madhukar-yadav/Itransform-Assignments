import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Person{
	
	
	String Name;
	
	public Person(String name) {
		
		
		this.Name=name;
		
	}
	
	

	public String getName() {
		return Name;
	}





	public void setName(String name) {
		Name = name;
	}


	@Override
	public String toString() {
		
		
		return "Product Name = "+ this.Name   +"\n"; 
		
	}
	
}

class lambdaExamplefour{
	
	public static void main(String args[]) {
		
		List<Person> people = Arrays.asList(
			new Person("Omkar"),
			new Person("Indranil"),
			new Person("Aniket")
				);
		
		display(people, p ->  (p.getName().length() % 2) == 0  ); 
		
		
		
				
	}
	
	private static void display(List<Person> people,Predicate<Person> c) {
		for(Person o : people) {
			if(c.test(o))
			people.remove(o);
		}
		
		
		System.out.println(people);
	}
}