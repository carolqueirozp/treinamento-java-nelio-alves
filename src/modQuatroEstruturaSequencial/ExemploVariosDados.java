package modQuatroEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class ExemploVariosDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.printf("%s tem %d anos e possui uma renda de R$ %.2f%n", x, y, z);
		
		sc.close();

	}

}
