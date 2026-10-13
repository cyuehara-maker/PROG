/*
 * La cantidad de asteriscos disminuye mientras aumentan los espacios iniciales.
 */
package ejercicio06;

import java.util.Scanner;

public class TrianguloRectanguloArribaDerecha {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer height = s.nextInt();
		
		for (int i = 0; i < height; i++) {
			System.out.print(" ".repeat(i));
			System.out.println("*".repeat(height - i));
		}
		
		s.close();
	}
}
