package modCincoEstruturaCondicional;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "N�o s�o Multiplos", indicando se os valores lidos sao
		 * multiplos entre si. Aten��o, os numeros devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if ((A % 2 == 0) && (B % 2 == 0)) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("N�o Sao Multiplos");
		}

		sc.close();

	}

}
