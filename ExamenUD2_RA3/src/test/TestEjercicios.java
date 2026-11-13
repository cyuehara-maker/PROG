package test;

import java.util.Arrays;

import ejercicios.Ejercicios;

public class TestEjercicios {
	public static void main(String[] args) {

		System.out.println("\nCLASIFICAR TRIANGULO");
		System.out.println(Ejercicios.clasificarTriangulo(3, 4, 5)); // "RECTANGULO"
		System.out.println(Ejercicios.clasificarTriangulo(5, 5, 5)); // "EQUILATERO"
		System.out.println(Ejercicios.clasificarTriangulo(5, 5, 8)); // "ISOSCELES"
		System.out.println(Ejercicios.clasificarTriangulo(4, 6, 9)); // "ESCALENO"
		System.out.println(Ejercicios.clasificarTriangulo(2, 2, 4)); // "INVALIDO"

		System.out.println("\nTRIANGULO ALTERNO");
		Ejercicios.trianguloAlterno(1);
		System.out.println();
		Ejercicios.trianguloAlterno(5);

		System.out.println("\nPRIMERO CON DIVISORES");
		System.out.println(Ejercicios.primeroConDivisores(10, 20, 4)); // 12
		System.out.println(Ejercicios.primeroConDivisores(2, 10, 3)); // 6
		System.out.println(Ejercicios.primeroConDivisores(13, 13, 2)); // -1
		System.out.println(Ejercicios.primeroConDivisores(10, 10, 3)); // 10

		System.out.println("\nTRIBONACCI RECURSIVO");
		System.out.println(Ejercicios.tribonacci(0)); // 0
		System.out.println(Ejercicios.tribonacci(1)); // 1
		System.out.println(Ejercicios.tribonacci(2)); // 1
		System.out.println(Ejercicios.tribonacci(3)); // 2
		System.out.println(Ejercicios.tribonacci(5)); // 7
		System.out.println(Ejercicios.tribonacci(7)); // 24

		System.out.println("\nES CASI CRECIENTE");
		System.out.println(Ejercicios.esCasiCreciente(Arrays.asList(2, 4, 6, 8))); // true
		System.out.println(Ejercicios.esCasiCreciente(Arrays.asList(2, 5, 3, 7, 9))); // true
		System.out.println(Ejercicios.esCasiCreciente(Arrays.asList(2, 5, 3, 7, 4))); // false
		System.out.println(Ejercicios.esCasiCreciente(Arrays.asList(1, 3, 3, 5))); // true
		System.out.println(Ejercicios.esCasiCreciente(Arrays.asList(1))); // true
		System.out.println(Ejercicios.esCasiCreciente(Arrays.asList(5, 3, -1))); // false

		System.out.println("\nPRIMERA VENTANA OBJETIVO");
		System.out.println(Ejercicios.primeraVentanaObjetivo(Arrays.asList(2, 1, 5, 3, 2), 3, 9));			// 1
		System.out.println(Ejercicios.primeraVentanaObjetivo(Arrays.asList(2, 1, 5, 3, 2), 3, 11));			// -1
		System.out.println(Ejercicios.primeraVentanaObjetivo(Arrays.asList(4, 4, 1, 6), 2, 8));				// 0
		System.out.println(Ejercicios.primeraVentanaObjetivo(Arrays.asList(10, 10, 10), 2, 21)); 			// -1
		System.out.println(Ejercicios.primeraVentanaObjetivo(Arrays.asList(1, 2, 5, 4, 7, 1, 9), 2, 10));	// 3
		
		System.out.println("\nALTERNATES EVEN ODD");
		System.out.println(Ejercicios.alternatesEvenOdd(Arrays.asList(2, 3, 8, 5)));	// true
		System.out.println(Ejercicios.alternatesEvenOdd(Arrays.asList(1, 4, 7, 10)));	// true
		System.out.println(Ejercicios.alternatesEvenOdd(Arrays.asList(2, 3, 5, 8)));	// false
		System.out.println(Ejercicios.alternatesEvenOdd(Arrays.asList(2, 4, 7, 8)));	// false
		System.out.println(Ejercicios.alternatesEvenOdd(Arrays.asList(3)));				// true
		System.out.println(Ejercicios.alternatesEvenOdd(Arrays.asList()));				// true
	}
}
