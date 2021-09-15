package modCincoEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo4IfElse {

	public static void main(String[] args) {

		// Operadores de atribuição cumulativa
		
		/*
		 * 
		 * a += b (a = a + b)
		 * a -= b (a = a - b)
		 * a *= b (a = a * b)
		 * a /= b (a = a / b)
		 * a %= b (a = a % b)
		 * 
		 * */
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double conta = 50.00;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.00;
		}
		
		System.out.printf("Valor a Pagar: R$ %.2f%n", conta);

		sc.close();

	}

}
