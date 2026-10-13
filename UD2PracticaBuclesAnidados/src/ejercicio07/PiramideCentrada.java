/*
 * Dibuja una pirámide de N niveles. 
 */
package ejercicio07;

import java.util.Scanner;

public class PiramideCentrada {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer height = s.nextInt();
		
		for (int i = 1; i <= height; i++) {
			System.out.print(" ".repeat(height - i));
			System.out.println("*".repeat(2 * i - 1));
		}
		
		s.close();
	}
}
