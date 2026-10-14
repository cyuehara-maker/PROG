/*
 * La mitad superior se dibuja con * y la inferior con #.
 * Usa un número par de filas.
 */
package ejercicio14;

import java.util.Scanner;

public class RectanguloZonasHorizontales {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("filas: ");
		Integer row = s.nextInt();
		System.out.print("columnas: ");
		Integer col = s.nextInt();
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				if (i < row / 2) {
					System.out.print('*');
				} else {
					System.out.print('#');
				}
				
			}
			System.out.println();
		}
		
		s.close();
	}
}
