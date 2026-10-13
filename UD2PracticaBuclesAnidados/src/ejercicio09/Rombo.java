/*
 * Combina una pirámide de N niveles con una pirámide invertida sin repetir la fila central.
 */
package ejercicio09;

import java.util.Scanner;

public class Rombo {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer height = s.nextInt();

		Integer maxHeight = 2 * height - 1;
		for (int i = 1; i <= maxHeight; i++) {
			for (int j = 1; j <= maxHeight; j++) {

				// basura
				// if (i + j < height - 1 || i - j >= height || i - j < - height + 1 || i + j > height)
				// Math.floor(5 * height / 2)) { // i + j <= 5h/2
				/*
				 * { x - y > -h = |x - y| < h
				 * { x - y < h = |x - y| < h
				 * { x + y < 3h = |x + y - 2h| < h
				 * { x + y > h = |x + y - 2h| < h
				 */
				Integer differenceDistance = Math.abs(i - j);
				Integer sumDistance = Math.abs(i + j - 2 * height);
				if (differenceDistance < height && sumDistance < height) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}

			}
			System.out.println();
		}

		s.close();
	}
}
