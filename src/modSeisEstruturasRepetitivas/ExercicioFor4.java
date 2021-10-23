package modSeisEstruturasRepetitivas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor4 {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrayContainer = new ArrayList<String>();

		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (b != 0) {
				double div = a/b;		
				arrayContainer.add(String.valueOf(div));
			} else {
				String msg = "divisao impossivel";
				arrayContainer.add(msg);
			}
			
		}
		
        arrayContainer.forEach(System.out::println);      
	
		sc.close();

	}

}
