import java.util.Scanner;
import java.util.Locale;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i;
		double totalNotas = 0;
		
		double nt [] = new double [4];
		
		for (i = 0; i < 4; i++) {
			
			nt[i] = sc.nextDouble();
			totalNotas += nt[i];
		}
		
		totalNotas = totalNotas/4;
		
		System.out.println("Media notas: " + totalNotas);
		
		sc.close();
	}

}
