/*Crie um algoritmo que leia dois números inteiros e realize o sorteio de um número
aleatório. O algoritmo deve validar qual é o menor e o maior número informado pelo
teclado, para que independente da ordem que o usuário digite os números, consiga
realizar o sorteio.
Se o algoritmo gerar um número par, escreva na tela o número gerado e informe que
ele é par. Se o algoritmo gerar um número ímpar, escreva na tela o número gerado e
que ele é um número ímpar
 */

import java.util.Scanner;
import java.util.Random;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int n1,n2;	
		
		System.out.print("Digite dois numeros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("O maior numero: " + Math.max(n1, n2));
		System.out.println("O menor numero: " + Math.min(n1, n2));
		
		int naleatorio = random.nextInt(Math.max(n1, n2) - Math.min(n1, n2) + 1) + Math.min(n1, n2); 
		
		System.out.println("O numero aleatorio é " + naleatorio);
		
		if (naleatorio % 2 != 0) {
			System.out.println("O numero é impar.");	
		} else {
			System.out.println("O numero é par.");
		}
		
		System.out.println(naleatorio);
		
	sc.close();
	
	}

}
