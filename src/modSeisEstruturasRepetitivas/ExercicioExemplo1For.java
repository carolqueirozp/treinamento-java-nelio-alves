package modSeisEstruturasRepetitivas;

import java.util.Scanner;

public class ExercicioExemplo1For {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<=10; i++) {
			int produto = i * N;
			System.out.println(i + " x " + N + " = " + produto);
		}
		
		sc.close();
		
	}

}
