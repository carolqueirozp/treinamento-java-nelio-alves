package modSeisEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor5 {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	

		int N = sc.nextInt();
		int fatorial = 1;
		
		if(N == 0) {
			fatorial = 1;
		} else {
			for (int i=N; i > 0; i--) {
				fatorial = fatorial * (i);
			}
		}
  
		System.out.println("O fatorial de " + N + " é: " + fatorial);
	
		sc.close();

	}

}
