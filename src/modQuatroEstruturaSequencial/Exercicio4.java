package modQuatroEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int matricula = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHoraTrabalhada = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHoraTrabalhada;
		
		System.out.println("NUMBER = " + matricula);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
