/*Escreva um algoritmo que leia dois valores: o primeiro servindo de indicador de
operação e o segundo correspondendo ao raio de um círculo ou esfera. Caso o
primeiro valor lido seja:
*/



import java.util.Scanner;
import java.util.Locale;

public class Exercicio_4 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int codigo;
	double r;
	
	System.out.println("1. calcular e imprimir o perímetro do círculo.");
	System.out.println("2. calcular e imprimir a área do círculo.");
	System.out.println("3. calcular e imprimir o volume da esfera.");
	System.out.print("Escolha a operação: ");
	
	codigo = sc.nextInt(); 
	
	if (codigo != 1 && codigo != 2 && codigo != 3) {
		System.out.println("Código da operação invalido");
	}
	
	System.out.print("Digite o valor do raio: ");
	r = sc.nextDouble();

	if (codigo == 1) {
		double perimetro;
		perimetro = 2 * Math.PI * r;
		System.out.print("O perimetro é: " + String.format("%.2f", perimetro));
	}
	
	if (codigo == 2) {
		double area;
		area = Math.PI * Math.pow(r, 2);
		System.out.println("A area do circulo é: " + String.format("%.2f", area));
	}
	
	if (codigo == 3) {
		double volume;
		volume = (4.0/3) * Math.PI * Math.pow(r, 3);
		System.out.println("O volume da esfera é: " + String.format("%.2f", volume));
	}
	
	sc.close();
	}

}
