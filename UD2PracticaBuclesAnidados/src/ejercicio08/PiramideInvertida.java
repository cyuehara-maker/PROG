package ejercicio08;

import java.util.Scanner;

public class PiramideInvertida {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer height = s.nextInt();
		
		for (int i = 0; i < height; i++) {
			System.out.print(" ".repeat(i));
			System.out.println("*".repeat(2 * height - 2 * i - 1));
		}
		
		s.close();
	}
}
