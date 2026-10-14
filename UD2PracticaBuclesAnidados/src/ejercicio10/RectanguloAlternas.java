/*
 * Las filas impares muestran * y las pares #.
 */
package ejercicio10;

import java.util.Scanner;

public class RectanguloAlternas {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("filas: ");
		Integer row = s.nextInt();
		System.out.print("columnas: ");
		Integer col = s.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < col; j++) {

				if (i % 2 != 0) {
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
