/*
 * Dibuja un cuadrado con # en las dos diagonales y puntos (.) en el resto.
 */
package ejercicio16;

import java.util.Scanner;

public class FiguraDosDiagonales {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer height = s.nextInt();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height ; j++) {
				if (i == j || j + i + 1 == height) {
					System.out.print('#');
				} else {
					System.out.print('.');
				}
			}
			System.out.println();
		}

		s.close();
	}
}
