package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int posicao = 0;
		int cont = 0;

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();

		int[] vetN = new int[N];
		int[] posi = new int[N];
		
		int maiorV = vetN[0];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetN[i] = sc.nextInt();

			if (vetN[i] > maiorV) {
				maiorV = vetN[i];
				posicao = i + 1;
				cont = 1;
				posi = new int[N];
			} else if (vetN[i] == maiorV) {
				posi[cont] = i + 1;
				cont++;
			}
		}

		System.out.println("\nMAIOR VALOR = " + maiorV);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);

		if (cont > 1) {
			System.out.print("OUTRAS POSICOES COM O MESMO VALOR: ");
			for (int i = 1; i < cont; i++) {
				System.out.print(posi[i] + " ");
			}
		}

		sc.close();
	}
}
