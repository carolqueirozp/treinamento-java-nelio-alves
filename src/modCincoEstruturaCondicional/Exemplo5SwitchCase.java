package modCincoEstruturaCondicional;
import java.util.Scanner;

public class Exemplo5SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();
		String diaSemana = null;

		switch (valor) {
		case 1:
			diaSemana = "domingo";
			break;
		case 2:
			diaSemana = "segunda-feira";
			break;
		case 3:
			diaSemana = "terça-feira";
			break;
		case 4:
			diaSemana = "quarta-feira";
			break;
		case 5:
			diaSemana = "quinta-feira";
			break;
		case 6:
			diaSemana = "sexta-feira";
			break;
		case 7:
			diaSemana = "sábado";
			break;
		default:
			diaSemana = "Valor inválido";
			break;
		}

		System.out.println("Dia da semana: " + diaSemana);

		sc.close();

	}

}
