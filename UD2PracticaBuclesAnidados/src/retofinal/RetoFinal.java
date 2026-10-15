/*
 * En la fila i muestra los números desde 1 hasta i, sin espacios entre ellos.
 */
package retofinal;

import java.util.Scanner;

public class RetoFinal {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Boolean exit = false;
		do {
			
			System.out.println("1. rombo");
			System.out.println("2. reloj");
			System.out.println("3. salir");
			System.out.print("> ");

			switch (s.nextInt()) {
			case 1: {
				
				System.out.print("N: ");
				Integer height = s.nextInt();
				
				Integer maxHeight = 2 * height - 1;
				for (int i = 1; i <= maxHeight; i++) {
					for (int j = 1; j <= maxHeight; j++) {

						Integer xDistance = Math.abs(i - j);
						Integer yDistance = Math.abs(i + j - 2 * height);
						if (xDistance < height && yDistance < height) {
							System.out.print('*');
						} else {
							System.out.print(' ');
						}

					}
					System.out.println();
				}
				
				break;
			}
			case 2: {
				
				System.out.print("N: ");
				Integer height = s.nextInt();
				
				Integer maxHeight = 2 * height - 1;
				for (int i = 1; i <= maxHeight; i++) {
					for (int j = 1; j <= maxHeight; j++) {
						
						Boolean top = (i + j > 2 * height || i > j);
						Boolean bottom = (i + j < 2 * height || i < j);
						if (top && bottom) {
							System.out.print(' ');
						} else {
							System.out.print('*');
						}
						
					}
					System.out.println();
				}
				
				break;
			}
			case 3:
				exit = true;
				System.out.println("saliendo...");
				break;
			default:
				System.out.println("no es una opcion");
			}
			
		} while (!exit);
		
		s.close();
	}
}
