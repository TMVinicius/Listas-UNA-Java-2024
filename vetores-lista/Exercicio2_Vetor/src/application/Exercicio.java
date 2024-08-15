package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();

		double soma = 0;
		

		double[] vetN = new double[N];

		for (int i = 0; i < vetN.length; i++) {
			System.out.print("Digite um numero: ");
			vetN[i] = sc.nextInt();
		}

		System.out.print("\n" + "VALORES = ");

		for (int i = 0; i < vetN.length; i++) {
			System.out.print(vetN[i] + "  ");
			soma = soma + vetN[i];
		}
		
		double media = soma / N;
		
		System.out.println("\n" + "SOMA = " + String.format("%.2f", soma));
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}

}
