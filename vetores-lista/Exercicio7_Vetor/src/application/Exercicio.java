package application;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		
		double vetN[] = new double[N];	
		double somaTotal = vetN[0];
		
		for(int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetN[i] = sc.nextDouble();
			somaTotal = somaTotal + vetN[i];
		}
		
		double media;
		System.out.println("\nMEDIA DO VETOR = " + (media = somaTotal/N));
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < N ; i++) {
			if (vetN[i] < media) {
				System.out.println(vetN[i]);
			}
		}

		sc.close();
	}

}
