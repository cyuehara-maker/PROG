/*
 * En la fila i muestra los números desde 1 hasta i, sin espacios entre ellos.
 */
package blueprint;

import java.util.Scanner;

public class Blueprint {
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
