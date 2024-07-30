/*Escreva um algoritmo que leia 3 números a partir do teclado
O algoritmo deve apresentar:
a. O maior número.
b. O menor número.
c. A média aritmética dos três números.
*/



import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double n1,n2,n3,maiornumero,menornumero,maiornumero1,menornumero1,media;
	
	System.out.print("Escreva três numeros:");
	n1= sc.nextDouble();
	n2= sc.nextDouble();
	n3= sc.nextDouble();
	
	maiornumero = Math.max(n1, n2);
	maiornumero1= Math.max(maiornumero, n3);
	menornumero = Math.min(n1, n2);
	menornumero1= Math.min(menornumero, n3);
	media= (n1+n2+n3)/3;
	
	System.out.println("O maior numero é " + maiornumero1);
	System.out.println("O menor numero é " + menornumero1);
	System.out.println("A media é: " + media);	
	sc.close();

	}

}
