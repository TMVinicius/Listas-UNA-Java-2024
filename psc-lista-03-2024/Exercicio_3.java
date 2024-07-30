/* Escreva um algoritmo que resolva uma equação de segundo grau, realizando a
verificação de consistência dos valores dos coeficientes ("a", "b" e "c") e do
discriminante (delta).
 */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_3 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
	double a, b, c, delta;
	
	System.out.print("Informe os valores dos coeficientes a, b, c:");
	a = sc.nextDouble();
	b = sc.nextDouble();
	c = sc.nextDouble();
	
	delta = Math.pow(b, 2) - 4*a*c;
	
	
	
	if (a == 0 && b == 0 && c != 0) {
		System.out.println("Coeficientes informados incorretamente.");
	}
	if (a == 0 && b !=0) {
		System.out.println("Essa é uma equação de primeiro grau.");
		double raiz = -c/b;
		System.out.print("O valor de x é: " + raiz);
	}
	if (delta < 0) {
		System.out.println("Esta equação não possui raizes reais.");
	}
	if (delta == 0) {
		System.out.println("Esta equação possui duas raizes reais iguais.");
		double raizes;
		raizes = (-b + Math.sqrt(delta))/(2*a);
		System.out.print("valor das raizes: " + raizes);
	}
	
	if (delta > 0) {
		System.out.println("Esta equação possui duas raizes reais diferentes.");
		double raiz1,raiz2;
		raiz1 = (-b + Math.sqrt(delta))/(2*a);
		raiz2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.print("valor das raizes: " + raiz1 + " e " + raiz2);
	}		
	sc.close();
	}

}
