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
				 * x=y -> ///
				 * (x,y) (0,1) -> x<y
				 * x-y<0
				 * 
				 * x-y=0 -> \\\
				 * (x,y) (0,1) -> 0-(-1)>0 -> x-y>0
				 * x-y+2h>0
				 * 
				 * imagina que una recta diagonal separa todo el plano
				 * imagina que no hay 1 si no 2 rectas
				 * imagina que haces xor
				 * 
				 */
				Integer diagonal = i + j - 2 * height;
				Integer antiDiagonal = i - j;
				if (antiDiagonal <= 0 ^ diagonal >= 0 || antiDiagonal == 0 || diagonal == 0) {
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
