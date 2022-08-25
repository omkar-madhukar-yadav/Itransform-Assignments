import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class LamdaExampleThree{
	public static void main(String args[]) {
		
		List<Order> product = Arrays.asList(
				new Order("TV",2000,"ACC"),
				new Order("FRIDGE",5000,"COM"),
				new Order("FAN",1500,"COM")
					);
		
		Consumer<String> c = o -> System.out.println(o);
		
		for(Order o : product) {
			
			System.out.println(o);
			
		Supplier<LocalDateTime> s	= () -> LocalDateTime.now();
		
		LocalDateTime t = s.get();
		System.out.println(t);
		
		Function<Integer,Integer> f = value -> value / 10;
		
	    f = f.andThen(value -> value *2);
		
		System.out.println(f.apply(50));
	
	}
	
}
}
