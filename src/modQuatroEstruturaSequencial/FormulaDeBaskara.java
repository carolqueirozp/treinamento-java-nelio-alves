package modQuatroEstruturaSequencial;

public class FormulaDeBaskara {

	public static void main(String[] args) {
		
		double delta, x1, x2;
		double a = 1;
		double c = 3;
		double b = 5;
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.printf("x1 = %.2f%n", x1);
		System.out.printf("x2 = %.2f%n", x2);	

	}

}
