/*
 * 
 */
package ejercicio17;

import java.util.Scanner;

public class TrianguloNumeros {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer height = s.nextInt();
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height; j++) {
				if (j <= i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
		s.close();
	}
}
