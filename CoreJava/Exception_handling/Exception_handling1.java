class example_exception{
	
	public void devide(int a )
	{
		
		try {
		int b = 0;
		
		
		int c = a/b;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("can not devide by 0 ");
		}
		
		
		
	}
}
class example_exception1{
	
	public void devide(int a )
	{
		
		try {
		int b = 0;
		
		if (a==0 || b==0 )
		{
			throw new UnsupportedOperationException();
		}
		int c = a/b;
		}
		
		catch(UnsupportedOperationException e)
		{
			System.out.println("can not devide by 0 ");
		}
		
		
		
	}
}


class Exception_handling1{
	
	public static void main(String args[]) {
		
		example_exception a= new example_exception();
		
		a.devide(10);
	}
}