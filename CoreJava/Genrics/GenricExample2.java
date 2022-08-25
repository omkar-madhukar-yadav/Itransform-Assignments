import java.util.Scanner;

class examplearray <T>{
	
	public  void display(T a[],int ch,int ch1) {
		T temp;
		temp=a[ch];
		a[ch]=a[ch1];
		a[ch1]=temp;
		
		for(int i=0; i<a.length ; i++)
		{
		System.out.printf("%s ",a[i]);
		}
	}
	
}

class GenricExample2{
	
	public static void main(String args[]) {
		
		examplearray<Integer> e= new examplearray<Integer>();
		
		Integer[] a = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the poisitions u want to switch the element");
		 int ch = sc.nextInt();
		 
		 System.out.println("Enter the poisitions u want to switch the element with");
		 int ch1 = sc.nextInt();
		
		e.display(a,ch,ch1);
	}
}