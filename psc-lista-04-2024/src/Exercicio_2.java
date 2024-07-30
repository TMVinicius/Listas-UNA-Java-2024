
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String usuario, senha;
		
		
		System.out.print("Digite o nome de usuário: ");
		usuario = sc.nextLine();

		System.out.print("Digite a senha: ");
		senha = sc.nextLine();
		
		while (usuario.equals(senha)) {
			System.out.println("O usuario e senha não podem ser os mesmos!");
			
			System.out.print("Digite o nome de usuário: ");
			usuario = sc.nextLine();

			System.out.print("Digite a senha: ");
			senha = sc.nextLine();
		}
	
		
		sc.close();
	}

}
