import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

class ElevenFeature2{
	
	public static void main(String args[]) {
		
//		ArrayList<String> list = (ArrayList<String>) Arrays.asList(
//				"A",
//				"Quick",
//				"Fox"
//					);
		
		ArrayList<String> lia = new ArrayList();
		lia.add("A");
		lia.add("Quick");
		lia.add("Brown");
		lia.add("Fox");
		lia.add("Jumps");
		lia.add("Over");
		lia.add("The");
		lia.add("Lazy");
		lia.add("Dog");
		
		
//		String[] result = lia.stream().toArray(String[] :: new);
		String[] res = lia.toArray(new String[lia.size()]);
	
		System.out.println(Arrays.toString(res));	
	}
}