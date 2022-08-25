class LamdaExampleOne{
	public static void main(String args[]) {
		
		ab lvar = (double a , double b ) ->  a*b;
		
		ab lvar1 = (double a , double b ) ->  a+b;
		
		ab lvar2 = (double a , double b ) ->  a-b;
		
		System.out.println(lvar.gen(22.2,15.1));
		
		System.out.println(lvar1.gen(22.2,15.1));

		System.out.println(lvar2.gen(22.2,15.1));

		
	}
	
}

interface ab{
	
	public double gen(double a , double b);
}