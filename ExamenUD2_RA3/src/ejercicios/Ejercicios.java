package ejercicios;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utiles.Utiles;

public class Ejercicios {

	// Clasificación de triangulos
	public static String clasificarTriangulo(Integer a, Integer b, Integer c) {

		List<Integer> lis = new ArrayList<>();
		lis.add(a);
		lis.add(b);
		lis.add(c);
		Collections.sort(lis);

		Boolean esValido = lis.get(0) + lis.get(1) > lis.get(2);

		if (!esValido) {
			return "INVALIDO";
		}

		if (lis.get(0) * lis.get(0) + lis.get(1) * lis.get(1) == lis.get(2) * lis.get(2)) {
			return "RECTANGULO";
		}

		if (a == b && a == c && b == c) {
			return "EQUILATERO";
		}

		if (lis.get(0) - lis.get(1) + lis.get(2) == lis.get(2)) {
			return "ISOCELES";
		}

		if (lis.get(0) != lis.get(1) && lis.get(1) != lis.get(2)) {
			return "ESCALENO";
		}

		return "EQUILATERO";
	}

	// triángulo de números alternos
	public static void trianguloAlterno(Integer n) {

		for (int i = 0; i < n; i++) { // bucle de filas
			for (int j = 0; j < n; j++) { // bucle de columnas

				if (j <= i) { // area del triangulo
					System.out.print((i + j + 1) % 2); // la suma de i + j es par, se añade un offset
				} else {
					System.out.print(" "); // espacio en blanco
				}

			}
			System.out.println(); // siguiente linea
		}
	}

	// buscar un número por sus divisores
	public static Integer primeroConDivisores(Integer inicio, Integer fin, Integer minimoDivisores) {

		for (int i = inicio; i <= fin; i++) {
			if (Utiles.contarDivisores(i) >= minimoDivisores) {
				return i;
			}
		}

		return -1;
	}

	// tribonacci recursivo
	public static Integer tribonacci(Integer n) {

		// suponiendo que n >= 0
		// casos base de 0 a 2

		switch (n) {
		case 0, 1:
			return n;
		case 2:
			return 1;
		}

		// obtener recursivamente n anteriores y sumarlos
		return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
	}

	public static BigInteger tribonacciPeroMejorPorqueEsMasRapidoYTeSacaUnTochoGrandeDeNumerosEnLaPantalla(Integer n) {
		
		switch (n) {
		case 0:
			return BigInteger.ZERO;
		case 1:
			return BigInteger.ONE;
		case 2:
			return BigInteger.ONE;
		default:
		}
		
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		BigInteger c = BigInteger.ONE;
		BigInteger next = null;
		for (int i = 0; i < n; i++) {
			next = a.add(b).add(c);
			a = b;
			b = c;
			c = next;
		}
		
		return a;
	}

	// lista casi creciente
	public static Boolean esCasiCreciente(List<Integer> datos) {

		Boolean esCasiCreciente = true;
		Integer numeroRupturas = 0;

		for (int i = 0; i < datos.size() - 1; i++) {

			if (datos.get(i) >= datos.get(i + 1)) {
				numeroRupturas++;
			}
			if (numeroRupturas > 1) {
				esCasiCreciente = false;
				break;
			}
		}

		return esCasiCreciente;

	}

	// primera venta que alcanza el objetivo
	public static Integer primeraVentanaObjetivo(List<Integer> ventas, Integer longitud, Integer objetivo) {

		for (int i = 0; i < ventas.size() - longitud; i++) {
			if (Utiles.sumarVentana(ventas.subList(i, i + longitud)) >= objetivo) {
				return i;
			}
		}

		return -1;
	}

	// even and odd numbers
	public static Boolean alternatesEvenOdd(List<Integer> numbers) {

		if (numbers.size() < 2) {
			return true;
		}

		return Utiles.alternatesAreEvenOrOdd(numbers, 0) && Utiles.alternatesAreEvenOrOdd(numbers, 1);
	}
}
