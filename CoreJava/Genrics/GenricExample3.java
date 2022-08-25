import java.util.Date;

class Pair <T,U>{
	
	T key ;
	U value;
	public Pair(T Key,U Value) {
		
		key=Key;
		value=Value;
		
	}
	
	public void display() {
		
		System.out.println("Key is " +this.key + " value is " +this.value);
	}
}
class GenricExample3{
	
	public static void main(String args[])
	{
		Pair <String,String> p = new Pair <String,String>("1","omkar");
		
		Date d1= new Date();
		Pair <String,Date> p1 = new Pair<String,Date>("1",d1);
		
		p.display();
		p1.display();
		
	}
}