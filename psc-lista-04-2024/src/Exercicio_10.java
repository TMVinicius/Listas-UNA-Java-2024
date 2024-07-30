

import java.util.Scanner;
public class Exercicio_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, x;

		
		System.out.println("Digite dois numeros inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1 == n2 || Math.abs(n1 - n2) == 1 ) {
			
			System.out.println("Não há intervalo entre eles");
		}
		else if (n1 > n2) {
			x = n1 - 2;
			
			while (n2 <= x) {
			
			n2++;	
			System.out.println(n2);
		}	
		}
		else if (n1 < n2) {
			x = n2 - 2;
			
			while (n1 <= x) {
				
			n1++;	
			System.out.println(n1);
		}	
		
		
		sc.close();
	
		}
	}
}

