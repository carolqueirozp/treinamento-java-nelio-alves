package modSeisEstruturasRepetitivas;

import java.util.Scanner;

public class ExercicioFor7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	

		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			System.out.println(i + " " + (long)Math.pow(i,2) + " " + (long)Math.pow(i,3));
		}
	
		sc.close();

	}

}
