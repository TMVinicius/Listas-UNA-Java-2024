import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i; 
		double vet [] = new double[5];
		
		for(i = 0; i < 5; i++) {
			
			vet[i] = sc.nextDouble();			
		}
		
		for(i = 0; i < 5; i++) {
			System.out.println(vet[i]);
		}
		
		sc.close();
	}
}
