package test;

import java.util.List;

import ejercicios.Ejercicios;
import utiles.Utiles;

public class TestEjercicios {

	public static void main(String[] args) {
		System.out.println("UTILES");
		System.out.println("\nes primo");
		System.out.println(Utiles.isPrime(7));
		System.out.println(Utiles.isPrime(15));
		
		System.out.println("\nes perfecto");
		System.out.println(Utiles.isPerfect(6));
		System.out.println(Utiles.isPerfect(15));

		System.out.println("\nsuma de unidades");
		System.out.println(Utiles.sumUnits(6));
		System.out.println(Utiles.sumUnits(15));
		
		System.out.println("\nEJERCICIOS");
		System.out.println("\nla taquilla del cine");
		System.out.println(Ejercicios.precioEntrada(10, "SABADO", true));
		System.out.println(Ejercicios.precioEntrada(35, "LUNES", false));
		System.out.println(Ejercicios.precioEntrada(66, "VIERNES", true));
		System.out.println(Ejercicios.precioEntrada(-1, "LUNES", false));
		
		System.out.println("\ndibujar una z con asteriscos");
		System.out.println("0");
		Ejercicios.dibujarZ(0);
		System.out.println("1");
		Ejercicios.dibujarZ(1);
		System.out.println("5");
		Ejercicios.dibujarZ(5);
		
		System.out.println("\nsuma de números especiales");
		System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 3));
		System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 5));
		System.out.println(Ejercicios.sumaPrimerosEspeciales(8, 15, 2));

		System.out.println("\nfactorial con salto");
		System.out.println(Ejercicios.factorialConSaltos(7, 2));
		System.out.println(Ejercicios.factorialConSaltos(8, 3));
		System.out.println(Ejercicios.factorialConSaltos(5, 1));
		System.out.println(Ejercicios.factorialConSaltos(0, 2));
		
		System.out.println("\ndetectar picos de una ruta");
		System.out.println(Ejercicios.contarPicos(List.of(2, 5, 1, 6, 3, 9, 7), 2));
		System.out.println(Ejercicios.contarPicos(List.of(2, 5, 4, 7, 4), 3));
		System.out.println(Ejercicios.contarPicos(List.of(1, 2), 1));
		System.out.println(Ejercicios.contarPicos(List.of(1, 10, 1), 5)); // 1 (picos: 10)
		System.out.println(Ejercicios.contarPicos(List.of(1, 2, 3, 6, 2, 5, 10, 1), 3)); // 2 (picos: 6, 10)
	
		System.out.println("\nbuscar por suma de cifras");
		System.out.println(Ejercicios.primeraPosicionSumaCifras(List.of(42, 153, 85, 29), 9));
		System.out.println(Ejercicios.primeraPosicionSumaCifras(List.of(42, 153, 85, 29), 13));
		System.out.println(Ejercicios.primeraPosicionSumaCifras(List.of(0, 31), 0));
		System.out.println(Ejercicios.primeraPosicionSumaCifras(List.of(42, 153), 18));
		System.out.println(Ejercicios.primeraPosicionSumaCifras(List.of(12, 13, 14, 15), 6)); // 3 (1 + 5)
		System.out.println(Ejercicios.primeraPosicionSumaCifras(List.of(38, 65, 444, 123), 6)); // 3 (1 + 2 + 3)
	
		System.out.println("\nnon-overlapping pairs");
		System.out.println(Ejercicios.countNonOverlapingPairs(List.of(2, 3, 2, 8, 7)));
		System.out.println(Ejercicios.countNonOverlapingPairs(List.of(1, 2, 3)));
		System.out.println(Ejercicios.countNonOverlapingPairs(List.of(1, 1, 1)));
	}
	
}
