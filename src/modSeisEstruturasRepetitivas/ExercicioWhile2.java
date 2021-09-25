package modSeisEstruturasRepetitivas;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {

		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo ser� encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situa��o sem escrever mensagem
		 * alguma).
		 */
		
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt(); 
		int Y = sc.nextInt();
		
		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("primeiro");
			} else if (X < 0 && Y > 0) {
				System.out.println("segundo");
			} else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			
			X = sc.nextInt(); 
			Y = sc.nextInt();
		}

		sc.close();
	}

}
