package modCincoEstruturaCondicional;
import java.util.Scanner;

public class Exemplo3IfElse {

	public static void main(String[] args) {

		// Encadeamento de Estruturas Condicionais

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}

		sc.close();

	}

}
