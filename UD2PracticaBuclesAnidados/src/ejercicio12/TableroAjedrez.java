/*
 * Alterna * y # tanto por filas como por columnas.
 * Puedes estudiar la paridad de fila + columna.
 */
package ejercicio12;

import java.util.Scanner;

public class TableroAjedrez {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("filas: ");
		Integer row = s.nextInt();
		System.out.print("columnas: ");
		Integer col = s.nextInt();
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				if ((i + j) % 2 == 0) {
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
