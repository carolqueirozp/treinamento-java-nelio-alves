package modSeisEstruturasRepetitivas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor3 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrayContainer = new ArrayList<String>();
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;
			
			DecimalFormat fmt = new DecimalFormat("0.0");
			String mediaFormat = fmt.format(media);
			
			arrayContainer.add(mediaFormat);
			
		}

		arrayContainer.forEach(System.out::println);
		
		sc.close();
		
	}

}
