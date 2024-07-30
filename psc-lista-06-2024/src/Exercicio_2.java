import java.util.Locale;
import java.util.Scanner;
public class Exercicio_2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double vet[] = new double[10];
		int i;
		
		for (i = 9; i > -1; i--) {
			
			vet[i] = sc.nextDouble();
		}
		
		for (i = 0; i < 10; i++) {
			
			System.out.println(vet[i]);
		}
		
		sc.close();
	}
}