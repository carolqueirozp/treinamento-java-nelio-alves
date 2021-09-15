import java.util.Locale;

public class Main {

	public static void main(String[] args) { //Define o Entry Point da Aplicação (Entrada do Programa)
		
		int y = 32;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		
		
		//Exibindo um valor inteiro
		System.out.println(y);
		
		//Exibindo ponto flutuante
		System.out.println(x);
		
		// Delimitar caas decimais. %n = quebra de linha.
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		/* O printf por padrão pega o comportamento do computador que está sendo utilizado. No meu caso é a ','
		 * Para alterar a ',' por '.' é necessário alterar a localização do programa. 
		 */
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		//Exibindo uma mensagem na tela.
		System.out.println("Bom dia!");
		
		// Concatenar
		System.out.println("Resultado = " + x + " metros");
		
		// Concatenar utilizando o printf (o valor será substituido por %f)
		System.out.printf("Resultado = %.2f metros%n", x);
		
		// Concatenar vários elementos em um mesmo comando de escrita
		/*
		 * Marcadores:
		 * 
		 * %f = ponto flutuante
		 * %d = inteiro
		 * %s = texto
		 * %n = quebra de linha
		 * */
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		

	}

}
