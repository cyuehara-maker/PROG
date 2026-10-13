/*
 * Pide la altura N y construye un triángulo creciente alineado a la izquierda.
 */
package ejercicio03;

import java.util.Scanner;

public class TrianguloRectanguloAbajoIzquierda {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer height = s.nextInt();
		
		for (int i = 1; i <= height; i++) {
			System.out.println("*".repeat(i));
		}
		
		s.close();
	}
}
