package modSeisEstruturasRepetitivas;

import java.util.Scanner;

public class Exemplo1PraticarDebug {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int soma = 0;

		// Recomendada quando n�o se sabe previamente a quantidade de repeti��es.
		/*
		 * Regra:
		 * Se a condi��o for verdadeira: executa e volta.
		 * Se a condi��o for falsa: pula fora.
		 * */
		
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}

		System.out.println(soma);

		sc.close();

	}

}
