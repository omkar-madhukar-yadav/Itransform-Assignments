import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

class lambdaExampleSix{
	
	public static void main(String args[]) {
		
		List<String> list = Arrays.asList(
			"Omkar",
			"Indranil",
			"Aniket"
				);

		list.replaceAll(s -> s.toUpperCase());
		
		
		System.out.println(list);
		
}
}