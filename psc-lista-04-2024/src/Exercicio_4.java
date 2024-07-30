
import java.util.Locale;
public class Exercicio_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double A = 80000;
		double B = 200000;
		int anos = 0;
		
		while (A <= B) {
			double x = A * 0.03;
			double y = B * 0.015;
			
			A += x ;
			B += y ;
			
			anos ++;
		}
		
		int A1 = (int) A;
		int B1 = (int) B;
		
		System.out.println("A população do país A é: " +  A1);
		System.out.println("A população do país B é: " +  B1);
	
		System.out.println("Seriam necessarios " + anos + "anos." );
	}

}
