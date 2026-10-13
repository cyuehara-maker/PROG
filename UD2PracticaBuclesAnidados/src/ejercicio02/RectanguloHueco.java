/*
 * Dibuja solo el contorno. Las posiciones interiores son espacios.
 */
package ejercicio02;

import java.util.Scanner;

public class RectanguloHueco {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("filas: ");
		Integer row = s.nextInt();
		System.out.print("columnas: ");
		Integer col = s.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				
				if (i == 1 || i == row) {
					System.out.print('*');
					continue;
				}
				
				if (j == 1 || j == col) {
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
