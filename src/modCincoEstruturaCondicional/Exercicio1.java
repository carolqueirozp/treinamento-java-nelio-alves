package modCincoEstruturaCondicional;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um numero inteiro, e depois dizer se este numero é
		 * negativo ou nao.
		 */
		
		Scanner sc = new Scanner(System.in);	
		
		int valor = sc.nextInt();
		
		if (valor < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();

	}

}
