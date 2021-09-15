package modCincoEstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double totalImposto;
		
		if (salario >= 0.00 && salario <= 2000.00) {
			totalImposto = 0.00;
		} else if (salario >= 2000.01 && salario <= 3000.00) {
			totalImposto = (salario - 2000.00) * 0.08;
		} else if (salario >= 3000.1 && salario <= 4500.00) {
			totalImposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
		} else {
			totalImposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
		}
		
		if (totalImposto == 0.00) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", totalImposto);
		}
		
		sc.close();

	}

}
