package application;

import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Scanner;
import entities.Pessoa;

public class Exercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner sc = new Scanner(System.in);
		
		
		double somaAltura = 0;
		int cont = 0;
		String n;
		int id;
		double al;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();

		Pessoa[] P = new Pessoa[N];

		for (int i = 0; i < P.length; i++) {
			
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome:");
			sc.nextLine();
			n = sc.nextLine();
			System.out.print("Idade: ");
			id = sc.nextInt();			
			System.out.print("Altura: ");
			al = sc.nextDouble();

			somaAltura = al + somaAltura;

			P[i] = new Pessoa(n, id, al);
			if (P[i].getIdade() <= 14) {
				cont++;
			}
		}

		System.out.println("\nAltura média: " + df.format(somaAltura/ N));

		System.out.print("Pessoas com menos de 16 anos: " + (cont * 100 / N) + "%");

		for (int i = 0; i < P.length; i++) {
			if (P[i].getIdade() <= 16) {
				System.out.println("\n" + P[i].getNome());
			}
		}
		
		
		sc.close();
	}

}
