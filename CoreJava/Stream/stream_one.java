import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

class Fruit{

	
	String Name,Colour;
	
	int Calories, Price;

	public Fruit(String name, String colour, int calories, int price) {
		super();
		Name = name;
		Colour = colour;
		Calories = calories;
		Price = price;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public int getCalories() {
		return Calories;
	}

	public void setCalories(int calories) {
		Calories = calories;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	
	@Override
	public String toString() {
		
		
		return " Name = "+ this.Name  +" Colour = "+ this.Colour + "  COST = "+ this.Price +"\n"; 
		
	}
	
}

class News{
	
	int NewsId;
	String CommenByUser,PostByUser,Comment;
	public News(int newsId, String commenByUser, String postByUser, String comment) {
		super();
		NewsId = newsId;
		CommenByUser = commenByUser;
		PostByUser = postByUser;
		Comment = comment;
	}
	public int getNewsId() {
		return NewsId;
	}
	public void setNewsId(int newsId) {
		NewsId = newsId;
	}
	public String getCommenByUser() {
		return CommenByUser;
	}
	public void setCommenByUser(String commenByUser) {
		CommenByUser = commenByUser;
	}
	public String getPostByUser() {
		return PostByUser;
	}
	public void setPostByUser(String postByUser) {
		PostByUser = postByUser;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	
	
}
class Trader{
	
	String Tname,City;

	public Trader(String tname, String city) {
		super();
		Tname = tname;
		City = city;
	}

	public String getTname() {
		return Tname;
	}

	public void setTname(String tname) {
		Tname = tname;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Trader [Tname=" + Tname + ", City=" + City + "]";
	}
	
	
}
class Transaction{
	
	Trader trader;
	int Value;
	String Year;
	public Transaction(Trader trader, String year, int value) {
		super();
		this.trader = trader;
		Year = year;
		Value = value;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public int getValue() {
		return Value;
	}
	public void setValue(int value) {
		Value = value;
	}
	
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", Value=" + Value + ", Year=" + Year + "]";
	}
	
	
}

class StreamExample{
	
	
	public static void main(String args[]) {
		
		List<Fruit> lif = Arrays.asList(
				new Fruit("Apple","red",500,450),
				new Fruit("Mango","yellow",2000,500),
				new Fruit("Melon","Green",50,150)
					);
		
		List<News> lin = Arrays.asList(
				new News(1,"Omkar","Indranil","Suresh kasa ahes budget"),
				new News(2,"Aniket","Viraj","Perfect niyojan direct karyakram"),
				new News(1,"Viraj","Omkar","Warna bank plus Warna budget dudh sangha")
					);
		
		ArrayList<Trader> lit = new ArrayList();
		Trader t1 = new Trader("Renuka","Warna");
		Trader t2 = new Trader("Anand","Delhi");
		Trader t3 = new Trader("Mauli","Pune");
		
		lit.add(t1);
		lit.add(t2);
		lit.add(t3);
		
		List<Transaction> litran = Arrays.asList(
				new Transaction(t1,"2020",1000),
				new Transaction(t2,"2021",1050),
				new Transaction(t3,"2022",3000)
					);
		
	
		//1
		lif.stream()
		.filter(p -> p.getCalories() < 100)
		.sorted()
		.forEach(p -> System.out.println(p.getName()));
		
		System.out.println("-------------------------------------------------------------");
		//2
		lif.stream()
		.forEach(System.out::println);
		System.out.println("-------------------------------------------------------------");
		
		//3
		lif.stream()
		.filter(p -> p.getColour().equalsIgnoreCase("red"))
		.sorted()
		.forEach(p -> System.out.println("Name = " +p.getName() + "  Price = " + p.getPrice()));
		System.out.println("-------------------------------------------------------------");
		
		//4
		
//		lin.stream()
//		.filter(p-> p.getComment().)
//		.forEach(p -> System.out.println("Name = " + p.getNewsId()));
	
		//5
		long a = lin.stream()
		.filter(p-> p.getComment().contains("budget"))
		.count();

       System.out.println(" count = " +a);
   	System.out.println("-------------------------------------------------------------");

   		//6
   		
   		
   		
   		//7
   		lin.stream()
   		.map(p -> p.getCommenByUser())
   		.forEach(System.out::println);
   		System.out.println("-------------------------------------------------------------");
   		
   		
   		//8
   		
   		litran.stream()
   		.filter(p -> p.getYear().equals("2020"))
   		.sorted()
   		.forEach(System.out::println);
   		System.out.println("-------------------------------------------------------------");

   		
   		//9
   		lit.stream()
   		.map(p -> p.getCity())
   		.distinct()
   		.forEach(p -> System.out.println(p));
   		System.out.println("-------------------------------------------------------------");

   		
   		//10
   		lit.stream()
   		.filter(p -> p.getCity().equalsIgnoreCase("Pune"))
   		.sorted((p1,p2) -> p1.Tname.compareTo(p2.Tname))
   		.forEach(System.out::println);
   		System.out.println("-------------------------------------------------------------");
   		
   		//11
   		lit.stream()
   		.map(p -> p.getTname())
   		.sorted(String::compareToIgnoreCase)
   		.forEach(System.out::println);
   		System.out.println("-------------------------------------------------------------");

   		
   		//12
   		 boolean val = lit.stream().anyMatch(p -> p.getCity().equalsIgnoreCase("Indore"));
   		System.out.println(val);
   		System.out.println("-------------------------------------------------------------");

   		//13
   		litran.stream()
   		.filter(p -> p.getTrader().City.equalsIgnoreCase("Delhi"))
   		.forEach(System.out::println);
   		System.out.println("-------------------------------------------------------------");

   		
   		//14
   		Optional<Transaction> t = litran.stream()
   		.max(Comparator.comparing(Transaction::getValue));
   		System.out.println(t);
   		System.out.println("-------------------------------------------------------------");

   		
   		//15
   		Optional<Transaction> res = litran.stream()
   		   		.min(Comparator.comparing(Transaction::getValue));
   		   		System.out.println(res);
   		
   		
   		
   	
	}
	
	}