
import java.util.Scanner;
public class Exercicio_7 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double n;
		double maior = Double.NEGATIVE_INFINITY;
		int c;
		
		
		for (c = 0 ; c < 5; c++) {
				
			System.out.println("Digite os numeros: ");
			n = sc.nextDouble();
			
			if (n > maior) {
			
				maior = n;
			}
			sc.close();
		}
		
		
		System.out.println("O maior numero é : " + maior);
		
		
	}

}
