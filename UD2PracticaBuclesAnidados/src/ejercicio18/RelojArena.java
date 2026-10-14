/*
 * Une una pirámide invertida con otra creciente, evitando duplicar la fila más estrecha.
 */
package ejercicio18;

import java.util.Scanner;

public class RelojArena {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer height = s.nextInt();
		
		Integer maxHeight = 2 * height - 1;
		for (int i = 1; i <= maxHeight; i++) {
			for (int j = 1; j <= maxHeight; j++) {
				
				/*
				 * x+y=2h => x+y<2h -> rightArea
				 * x-y=0  => x-y<0 -> leftArea
				 */
				Boolean top= (i + j > 2 * height || i - j > 0);
				Boolean bottom = (i + j < 2 * height || i - j < 0);
				if (top && bottom) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
				
			}
			System.out.println();
		}
		
		s.close();
	}
}
