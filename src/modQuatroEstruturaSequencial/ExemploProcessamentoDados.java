package modQuatroEstruturaSequencial;

public class ExemploProcessamentoDados {

	public static void main(String[] args) {
		
		System.out.println("EXEMPLO 1: ");

		int x, y;
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("=============================================");
		System.out.println("EXEMPLO 2: ");
		
		int b;
		double c;
		
		b = 5;
		c = 2 * b;
		
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.println("=============================================");
		System.out.println("EXEMPLO 3: ");
		
		double a, A, h, area;
		
		a = 6.0;
		A = 8.0;
		h = 5.0;
		
		area = (a + A) / 2.0 * h;
		
		System.out.println("AREA = " + area);
		
		System.out.println("=============================================");
		System.out.println("EXEMPLO 4: ");
		
		int r, s;
		double resultado;
		
		r = 5;
		s = 2;
		
		// Ao inserir o (double) eu estou fazendo um casting informando o formato do resultado desejado.
		resultado = (double) r / s;
		
		System.out.println(resultado);
		
		System.out.println("=============================================");
		System.out.println("EXEMPLO 5: ");
		
		double f;
		int g;
		
		f = 5.0;
		g = (int) f;
		
		System.out.println(g);

	}

}
