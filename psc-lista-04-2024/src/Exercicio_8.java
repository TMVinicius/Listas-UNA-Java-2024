
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n, soma = 0 , media = 0;
		int c;
		
		for (c = 0; c < 5; c++) {
			System.out.println("Informe os numeros: ");
			n = sc.nextDouble();
			
			soma += n;
			
			sc.close();
		}
		
		media = soma/5;
		
		System.out.println("A soma é igual a: " + soma);
		System.out.println("A media é igual a: " + media);
		
		
	
		
	
	}

}
