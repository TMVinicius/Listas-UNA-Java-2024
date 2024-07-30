/*Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces,
sucos e refrigerantes. O algoritmo deve calcular o menor número de notas que deve
ser dado de troco para um pagamento efetuado.
O algoritmo deve ler o valor da compra e o valor pago. Se o valor pago for menor que
o valor da compra, a máquina deve apresentar uma mensagem, informando que a
quantia paga é insuficiente para realizar a compra. A máquina aceita apenas notas de
R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.
 */

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int vlpago, vlcompra, troco;
	
	System.out.print("Escreva o valor da compra: R$");
	vlcompra = sc.nextInt();
	
	System.out.print("Escreva o valor pago: R$");
	vlpago = sc.nextInt();
	
	int trocot = troco = vlpago - vlcompra;

	if (vlcompra > vlpago || vlcompra == 0) {
		System.out.println("O valor inserido é insuficiente ou invalido para o pagamento");
	} else {
	int notas50 = 0;
	int notas20 = 0;
	int notas10 = 0;
	int notas5 = 0;
	int notas2 = 0;
	int notas1 = 0;
	
	if (troco >= 50){
	notas50 = trocot/50;
	troco = trocot - (notas50*50);
	} 
	if (troco >= 20) {
	notas20 = troco/20;
	troco = troco - (notas20*20);
	}
	if (troco >= 10) {
	notas10 = troco/10;
	troco = troco - (notas10*10);	
	}
	if (troco >= 5) {
	notas5 = troco/5;
	troco = troco - (notas5 * 5);	
	}
	if (troco >= 2) {
	notas2 = troco/2;
	troco = troco - (notas2 * 2);	
	}
	if (troco == 1) {
	notas1 = 1;	
	}
	
	System.out.println("O troco é " + trocot);
	System.out.println("Notas de R$50,00: " + notas50);
	System.out.println("Notas de R$20,00: " + notas20);
	System.out.println("Notas de R$10,00: " + notas10);
	System.out.println("Notas de R$5,00: " + notas5);
	System.out.println("Notas de R$2,00: " + notas2);
	System.out.println("Notas de R$1,00: " + notas1);
	
	sc.close();
	}
	}
}
