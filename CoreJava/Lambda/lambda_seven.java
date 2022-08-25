import java.util.TreeMap;
import java.util.function.Consumer;

class LambdaExampleSeven{
	
	
	public static void main(String args[]) {
		
		
		TreeMap<Integer,String> tm = new TreeMap();
		
		tm.put(1,"omkar");
		tm.put(2,"indranil");
		tm.put(3,"Aniket");
		
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append(tm.entrySet().toString());
		
		System.out.println(sb1);
		
//		 display(tm, s -> s.entrySet().toString());
		
 		
		
		
	}
	
//	private static void display(TreeMap<Integer,String> TM,Consumer<TreeMap> con) {
//		StringBuilder sb1 = new StringBuilder();
//		for(int i = 0 ; i<TM.size() ; i++) {
//			
//			
//			sb1.append(con);
//			
//		}
//		System.out.println(sb1);
//	}
}