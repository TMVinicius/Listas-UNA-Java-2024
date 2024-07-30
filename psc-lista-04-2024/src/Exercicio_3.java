
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, sexo, EC;
		int idade;
		double salario;
		
		System.out.print("Digite o nome: ");
		nome = sc.nextLine();

		
		while (nome.length() <= 3) {
			System.out.println("Digite um nome com mais de 3 caracteres!");
			nome = sc.nextLine();
			
		}
		
		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		
		while (idade <= 0 || idade >= 150) {
			System.out.print("Digite uma idade valida!");
			idade = sc.nextInt();
			
		}
	
		System.out.print("Digite o salario: ");
		salario = sc.nextDouble();
		
		while (salario <=0 ) {
			System.out.println("Digite um salario valido!");
			salario = sc.nextDouble();
			
		}
		
		sc.nextLine();
		
		System.out.print("Digite o sexo: ");
		sexo = sc.nextLine();
		
		while (!sexo.equals("f") && !sexo.equals("m")) {
			System.out.println("O sexo devera ser apenas m ou f: ");
			sexo = sc.nextLine();

		}
		
		System.out.print("Digite o Estado civil: ");
		EC = sc.nextLine();
		
		while (!EC.equals("s") && !EC.equals("c") && !EC.equals("v") && !EC.equals("d")) {
			System.out.println("O Estado Civil devera ser apenas  s, c, v, ou d: ");
			EC = sc.nextLine();
			
		}
		
		System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + EC);

		
		
		sc.close();
	}

}
