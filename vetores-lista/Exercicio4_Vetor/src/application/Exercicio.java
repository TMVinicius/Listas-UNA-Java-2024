package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cont = 0;

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();

		int[] vetN = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero:");
			vetN[i] = sc.nextInt();
		}

		System.out.println("\nNUMEROS PARES: ");

		for (int i = 0; i < N; i++) {
			if (vetN[i] % 2 == 0) {
				System.out.print(vetN[i] + "  ");
				cont++;
			}
		}
		
		System.out.print("\n\nQUANTIDADE DE PARES =  " + cont);

		sc.close();
	}

}
