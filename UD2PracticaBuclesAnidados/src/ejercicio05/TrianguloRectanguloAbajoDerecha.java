/*
 * Utiliza espacios iniciales para alinear los asteriscos a la derecha.
 */
package ejercicio05;

import java.util.Scanner;

public class TrianguloRectanguloAbajoDerecha {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer height = s.nextInt();
		
		for (int i = 1; i <= height; i++) {
			System.out.print(" ".repeat(height - i));
			System.out.println("*".repeat(i));
		}
		
		s.close();
	}
}
