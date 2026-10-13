/*
 * La primera fila tiene N asteriscos y cada fila siguiente uno menos.
 */
package ejercicio04;

import java.util.Scanner;

public class TrianguloRectanguloArribaIzquierda {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer height = s.nextInt();
		
		for (int i = 0; i < height; i++) {
			System.out.println("*".repeat(height - i));
		}
		
		s.close();
	}
}
