package modCincoEstruturaCondicional;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Não são Multiplos", indicando se os valores lidos sao
		 * multiplos entre si. Atenção, os numeros devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if ((A % 2 == 0) && (B % 2 == 0)) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Não Sao Multiplos");
		}

		sc.close();

	}

}
