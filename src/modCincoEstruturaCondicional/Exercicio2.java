package modCincoEstruturaCondicional;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa ler um número inteiro e dizer se este numero é par ou
		 * impar.
		 */

		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();

		if (valor%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();

	}

}
