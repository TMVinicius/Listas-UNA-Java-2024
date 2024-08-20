package application;

import java.util.Locale;
import java.util.Scanner;
import entities.SomaVetores;

public class Exercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SomaVetores sv = new SomaVetores();

		int N;
		int i = 0;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		N = sc.nextInt();

		int vetA[] = new int[N];
		int vetB[] = new int[N];
		
		System.out.println("Digite os valores do vetor A:");
		
		for (i = 0; i < N; i++) {
			
			vetA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		
		for (i = 0; i < N; i++) {

			vetB[i] = sc.nextInt();
		}
		
		
		System.out.println("VETOR RESULTANTE: ");
		
		for (i = 0; i < N; i++) {

			System.out.println(sv.vetorResultante(vetA, vetB, i));
			
		}

		sc.close();
	}

}
