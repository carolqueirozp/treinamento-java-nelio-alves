package modSeisEstruturasRepetitivas;

import java.util.Scanner;

public class ExercicioWhile3 {

	public static void main(String[] args) {

		/*
		 * Um Posto de combust?veis deseja determinar qual de seus produtos tem a
		 * prefer?ncia de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combust?vel abastecido (codificado da seguinte forma: 1.?lcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usu?rio informe um c?digo inv?lido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo c?digo (at? que seja v?lido). O programa
		 * ser? encerrado quando o c?digo informado for o n?mero 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combust?vel, conforme exemplo
		 */

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int totAlcool = 0;
		int totGasolina = 0;
		int totDiesel = 0;
		String mensagem = null;
			
		while (codigo != 4) {
			if (codigo == 1) {
				totAlcool = totAlcool + 1;	
			} else if (codigo == 2) {
				totGasolina = totGasolina + 1;
			} else if (codigo == 3) {
				totDiesel = totDiesel + 1;
			} else {
				mensagem = "MUITO OBRIGADO";
			}
				
			codigo = sc.nextInt();
		}
		
		System.out.println(mensagem);
		System.out.println("Alcool: " + totAlcool);
		System.out.println("Gasolina: " + totGasolina);
		System.out.println("Diesel: " + totDiesel);

		sc.close();
	}

}
