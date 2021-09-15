package modCincoEstruturaCondicional;

public class Exemplo6CondicionalTernaria {

	public static void main(String[] args) {

		double preco = 34.5;

		// Exemplo:
		/*
		 * if (preco < 20) { desconto = preco * 0.1; } else { desconto = preco * 0.05; }
		 */

		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);

	}

}
