package oferta;


public class Oferta {
	
	public static int oferta(int[] libros) {
		
		for (int i = 0; i < libros.length - 1; i++) {
			if (libros[i] < libros[i + 1]) {
				int aux = libros[i];
				libros[i] = libros[i + 1];
				libros[i + 1] = aux;
				
				i = -1;
			}
		}
		
		for (int i : libros) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		Integer discount = 0;
		for (int i = 2; i < libros.length; i += 3) {
			discount += libros[i];
		}
		
		return discount;
	}
}
