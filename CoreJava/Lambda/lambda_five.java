import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class lambdaExampleFive{
	
	public static void main(String args[]) {
		
		List<String> li = Arrays.asList(
			"Omkar",
			"Indranil",
			"Aniket"
				);

		StringBuilder sb = new StringBuilder();
		
		for(String s : li) {
			sb.append(s.charAt(0));
		}
		
		Consumer<StringBuilder> con = p -> System.out.println(p);
		
		con.accept(sb);
//		display(li, p ->  System.out.println(p.toString())  ); 
		
		
		
				
	}
	
//	private static void display(List<String> li,Consumer<StringBuilder> c) {
//		for(int i= 0 ; i<li.size(); i++ ) {
//			sb.append(li.toString().charAt(0));
			
//		}
		
		
		
//		c.accept(sb);
//	}
}