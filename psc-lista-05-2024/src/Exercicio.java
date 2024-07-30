
import java.util.Scanner;
import java.util.Locale;
public class Exercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i;
			double temp = 4; 
			double media; 
			double soma = 0;
				
				
			for (i = 1; i <= 10; i++) {
			
				System.out.print("Digite a temperatura " + i + " (entre 4 e 10):");
				temp = sc.nextDouble();
				
				while (temp < 4 || temp > 10 ) {
					
				System.out.print("Digite a temperatura " + i + " (entre 4 e 10):");
				temp = sc.nextDouble();
				
				
				}
				
				soma += temp;	
				
			}
			
			media = soma/10;
			
			System.out.println("A média de hoje das temperaturas é: " + media );
			
			sc.close();
		}	
	}
			
}
