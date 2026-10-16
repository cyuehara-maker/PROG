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
		for (int i = 0; i < maxHeight; i++) {
			for (int j = 0; j < maxHeight; j++) {
				 /*
				 * x=y -> ///
				 * (x,y) (0,1) -> x<y
				 * x-y<0
				 * 
				 * x-y=0 -> \\\
				 * (x,y) (0,1) -> 0-(-1)>0 -> x-y>0
				 * x-y+2h>0 -2 de for
				 */
				Integer top = i + j - 2 * height + 2;
				Integer bottom = i - j;
				if (bottom <= 0 ^ top >= 0 || bottom == 0 || top == 0) {
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
