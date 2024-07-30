/*Escrever um algoritmo que leia a partir do teclado dois números reais e um dos
símbolos de operação: + , - , * , / ou ^ .
O algoritmo deve retornar o resultado da operação.
 */

import java.util.Scanner;
import java.util.Locale; 

public class Exercicio_5 {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	char operador;
	double n1, n2, resultado;
	
	System.out.print("Operador que deseja realiza: ");
	operador = sc.next().charAt(0);
	
	System.out.print("Digite dois numeros: ");
	sc.nextLine();
	n1 = sc.nextDouble();
	n2 = sc.nextDouble();
	
	if (operador == '+') {
		resultado = n1+n2;
		System.out.println("O resultado da operação é: " + String.format("%.2f", resultado));
	}
	
	if (operador == '-') {
		resultado = n1-n2;
		System.out.println("O resultado da operação é: " + String.format("%.2f", resultado));
	}
	
	if (operador == '*') {
		resultado = n1 * n2;
		System.out.println("O resultado da operação é: " + String.format("%.2f", resultado));
	}
	
	if (operador == '/') {
		resultado = n1/n2;
		System.out.println("O resultado da operação é: " + String.format("%.2f", resultado));
	}
	
	if (operador == '^') {
		resultado = Math.pow(n1, n2);
		System.out.println("O resultado da operação é: " + String.format("%.2f", resultado));
	}
	
	sc.close();
	}

}
