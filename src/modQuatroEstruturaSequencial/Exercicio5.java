package modQuatroEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codPc1 = sc.nextInt();
		int qtdPc1 = sc.nextInt();
		double valorUnitPc1 = sc.nextDouble();
		
		int codPc2 = sc.nextInt();
		int qtdPc2 = sc.nextInt();
		double valorUnitPc2 = sc.nextDouble();
		
		double calc1 = qtdPc1 * valorUnitPc1;
		double calc2 = qtdPc2 * valorUnitPc2;
		
		double total = calc1 + calc2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();

	}

}
