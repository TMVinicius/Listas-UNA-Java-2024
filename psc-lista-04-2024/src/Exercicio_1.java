/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o usuário
informe um valor válido. */

import java.util.Locale;
import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n1 = 0;
		
		System.out.print("Digite um numero: ");
		n1 = sc.nextDouble();
		
		while (n1 <= 0 || n1 >= 10) {
			System.out.println("Informe um valor valido!");
			n1 = sc.nextDouble();		
		}
		
		sc.close();
	}

}
