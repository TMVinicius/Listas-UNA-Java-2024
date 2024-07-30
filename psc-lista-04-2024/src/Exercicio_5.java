
import java.util.Scanner;
import java.util.Locale;
public class Exercicio_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, txA, txB;
		int anos = 0;
		
		System.out.println("Digite a população do país A e país B: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		System.out.println("Digite a taxa de crescimento do país A e país B: ");
		txA = sc.nextDouble();
		txB = sc.nextDouble();
		
		double x = A * txA;
		double y = B * txB;
		
		while (A <= B) {
			
			A += x ;
			B += y ;
			
			anos ++;
		}
		
		int A1 = (int) A;
		int B1 = (int) B;
		
		System.out.println("A população do país A é: " +  A1);
		System.out.println("A população do país B é: " +  B1);
	
		System.out.println("Seriam necessarios " + anos + " anos." );
		
		sc.close();
	}

}
