package modSeisEstruturasRepetitivas;

import java.util.Scanner;

public class Exemplo1PraticarDebug {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int soma = 0;

		// Recomendada quando não se sabe previamente a quantidade de repetições.
		/*
		 * Regra:
		 * Se a condição for verdadeira: executa e volta.
		 * Se a condição for falsa: pula fora.
		 * */
		
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}

		System.out.println(soma);

		sc.close();

	}

}
