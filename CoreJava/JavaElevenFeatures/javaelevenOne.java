import java.util.function.Consumer;

interface Example{
	double cal(int a , double am);
}


class ElevenFeature{
	
	public static void main(String args[]) {
	
		Example c = (var a, var b) -> a * (b/100);
		
		System.out.println("Calculted Intrest is  = " +c.cal(2000,3) );
		
	}
	
}