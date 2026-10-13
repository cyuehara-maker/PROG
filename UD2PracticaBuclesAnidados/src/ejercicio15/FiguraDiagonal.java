/*
 * Dibuja un cuadrado de N×N en el que la diagonal principal sea # y el resto *.
 */
package ejercicio15;

import java.util.Scanner;

public class FiguraDiagonal {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer height = s.nextInt();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height ; j++) {
				if (i == j) {
					System.out.print('#');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}

		s.close();
	}
}
