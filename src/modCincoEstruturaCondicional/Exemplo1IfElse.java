package modCincoEstruturaCondicional;
import java.util.Scanner;

public class Exemplo1IfElse {

	public static void main(String[] args) {

		// Estrutura condicional Composta

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else {
			System.out.println("Boa Tarde!");
		}

		sc.close();

	}

}
