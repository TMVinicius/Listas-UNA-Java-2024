import java.util.Scanner;
public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetp[] = new int[20];
		int vetim[] = new int[20];
		int vetor[] = new int [20];
		
		int i, n;
		int P = 0;
		int I = 0;
		
		for (i = 0; i < 5; i++) {
			n = sc.nextInt();
			vetor[i] = n;
			
			if (n % 2 != 0) {
				vetim[I] = n;
				I++;
			} else {
				vetp[P] = n;
				P++;
			}
		}
		
		System.out.println("Todos os numeros: ");
		
		for (i = 0; i < 20; i++) {
			System.out.println(vetor[i]);
		}
		
		
		System.out.println("Pares: ");
		
		for (i = 0; i < P; i++) {
			System.out.println(vetp[i]);	
		}
		
		System.out.println("Impares: ");
				
		for (i = 0; i < I; i++) {
			System.out.println(vetim[i]);
		}
		
		sc.close();
	}
}
