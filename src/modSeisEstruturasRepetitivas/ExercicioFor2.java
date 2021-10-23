package modSeisEstruturasRepetitivas;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int contadorA = 0;
		int contadorB = 0;
		for(int i=1; i<=N; i++) {
			
			int X = sc.nextInt();
			
			if(X >= 10 && X <= 20) {
				contadorA = contadorA + 1;			
			} else {
				contadorB = contadorB + 1;		
			}
		}
		
		System.out.println(contadorA + " in");
		System.out.println(contadorB + " out");
		
		sc.close();
		
	}

}
