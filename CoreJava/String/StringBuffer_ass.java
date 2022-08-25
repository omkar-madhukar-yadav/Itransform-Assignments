class functions_strings
{
	
	public void operations(String a1) {
		
		//1
		String str = "hello Word";
		int len = str.length();
		System.out.println(len);
		
		//2
		String a = "hello", b ="How are u ";
		String c = a.concat(b);
		System.out.println(c);
		
		//3
		String d = " Java string pool refers to Collection Of Strings Which are stored in Heap Memory";
			//a
			String e = d.toUpperCase(); 
			System.out.println(e);
			//b
			 e = d.toLowerCase(); 
			System.out.println(e);
			//c
			e = d.replace("a", "$"); 
			System.out.println(e);
			//d
			boolean y = d.contains("Collection");
			System.out.println(y);
			//e
			boolean x = d.equals(e);
			System.out.println(x);
			System.out.println();
			
		
	}
}

class functions_stringbuffer{
	
	public void operation_buff() {
		
	StringBuffer sb = new StringBuffer();
	StringBuffer sb1 = new StringBuffer();
	StringBuffer sb2 = new StringBuffer();
	
	//1
	String a = "stringbuffer" , b = " Is a Peer Class of String" , c= " that provides much of " , d = " the functionality of string";
	sb.append(a);
	sb.append(b);
	sb.append(c);
	sb.append(d);
	
	System.out.println(sb);
	
	//2
	String e = "It is use to at the specified index position ";
	sb1.append(e);
	sb1.insert(13,"insert string ");
	System.out.println(sb1);
	
	
	String f = " this method return the reversed object on whichj it was called";
	sb2.append(f);
	sb2.reverse();
	
	System.out.println(sb2);
	System.out.println();
	
	}
}

class functions_stringbuilder{
	
	public void operation_builder() {
		
	StringBuilder sb = new StringBuilder();
	StringBuilder sb1 = new StringBuilder();
	StringBuilder sb2 = new StringBuilder();
	
	//1
	String a = "stringbuffer" , b = " Is a Peer Class of String" , c= " that provides much of " , d = " the functionality of string";
	sb.append(a);
	sb.append(b);
	sb.append(c);
	sb.append(d);
	
	System.out.println(sb);
	
	//2
	String e = "It is use to at the specified index position ";
	sb1.append(e);
	sb1.insert(13,"insert string ");
	System.out.println(sb1);
	
	
	String f = " this method return the reversed object on whichj it was called";
	sb2.append(f);
	sb2.reverse();
	
	System.out.println(sb2);
	
	}
}


public class StringBuffer_ass{
	
	public static void main(String args[]) {
		
		functions_strings a = new functions_strings();
		
		a.operations("abc");
		
		functions_stringbuffer obj = new functions_stringbuffer();
		
		obj.operation_buff();
		
		functions_stringbuilder obj1 = new functions_stringbuilder();
		
		obj1.operation_builder();
		
	}
}