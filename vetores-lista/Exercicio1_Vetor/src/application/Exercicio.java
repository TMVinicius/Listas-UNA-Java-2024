
package application;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		int[] vetN = new int[N];

		while (N > 10) {
			System.out.println("Maximo 10 numeros, digite novamente quantos numeros vai digitar:");
			N = sc.nextInt();
		}
		
		for (int i = 0; i < vetN.length; i++) {
				System.out.print("Digite um numero: ");
				vetN[i] = sc.nextInt();
			}

			System.out.println("NUMEROS NEGATIVOS: ");

			for (int i = 0; i < vetN.length; i++) {
				if (vetN[i] < 0) {
					System.out.println(vetN[i]);
				}
			}

		sc.close();
	}

}
