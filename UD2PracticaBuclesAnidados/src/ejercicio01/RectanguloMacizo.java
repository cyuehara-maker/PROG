/*
 * Pide filas y columnas. Dibuja un rectángulo de asteriscos.
 */
package ejercicio01;

import java.util.Scanner;

public class RectanguloMacizo {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("filas: ");
		Integer row = s.nextInt();
		System.out.print("columnas: ");
		Integer col = s.nextInt();
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print('*');				
			}
			System.out.println();
		}
		
		s.close();
	}
}
