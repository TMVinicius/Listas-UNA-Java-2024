import java.util.Scanner;
public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String vet[] = new String[1];
		
		vet[0] = sc.nextLine();
		
		int lidas = 0;
		char ch;
		
		for (int i = 0; i < 10; i++) {
			
			ch = vet[0].charAt(i);
			if ( ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' ) {
				
				lidas = lidas + 1;
				System.out.println(ch);
			}
	}
		 System.out.println("Numero de consoantes: " + lidas);
		 sc.close();
	}
}
