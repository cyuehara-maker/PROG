package ejercicios;

import java.util.List;
import java.util.Objects;

import utiles.Utiles;

public class Ejercicios {

	// 1. Sumar una lista mediante for-each.
	public static Integer suma1(List<Integer> numeros) {
		Integer suma = 0;

		for (Integer numero : numeros) {
			suma += numero;
		}

		return suma;
	}

	// 2. Sumar una lista mediante for clásico (con índice).
	public static Integer suma2(List<Integer> numeros) {
		Integer suma = 0;

		for (int i = 0; i < numeros.size(); i++) {
			suma += numeros.get(i);
		}

		return suma;
	}

	// 3. Sumar una lista mediante while.
	public static Integer suma3(List<Integer> numeros) {
		Integer suma = 0;
		int i = 0;

		while (i < numeros.size()) {
			suma += numeros.get(i);
			i++;
		}

		return suma;
	}

	// 4. Contar los números pares, incluido el 0.
	public static Integer contarPares(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				contador++;
			}
		}

		return contador;
	}

	// 5. Contar los números primos mediante la clase Utiles.
	public static Integer contarPrimos(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (Utiles.esPrimo(numero)) {
				contador++;
			}
		}

		return contador;
	}

	// 6. Contar los números perfectos mediante la clase Utiles.
	public static Integer contarPerfectos(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (Utiles.esPerfecto(numero)) {
				contador++;
			}
		}

		return contador;
	}

	// 7. Calcular la media mediante for-each.
	public static Double media1(List<Integer> numeros) {

		Integer suma = 0;
		for (Integer numero : numeros) {
			suma += numero;
		}

		return (double) suma / numeros.size();
	}

	// 8. Calcular la media mediante for clásico.
	public static Double media2(List<Integer> numeros) {

		Integer suma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			suma += numeros.get(i);
		}

		return (double) suma / numeros.size();
	}

	// 9. Calcular la media mediante while.
	public static Double media3(List<Integer> numeros) {

		Integer suma = 0;
		int i = 0;
		while (i < numeros.size()) {
			suma += numeros.get(i);
			i++;
		}

		return (double) suma / numeros.size();
	}

	// TODO Hacer aquí los ejercicios del examen
	// los haremos con distintos bucles

	// Ejercicio 1 — Control de acceso al Baile de los monstruos
	public static boolean puedeEntrar(Integer edad, boolean acompanado, String criatura) {
		return edad >= 18 || acompanado == true || criatura.equals("vampiro");
	}

	// Ejercicio 2 — Clasificador de caramelos
	public static Integer cuentaCaramelos(List<String> caramelos, String tipo) {
		return (int) caramelos.stream().filter(Objects::nonNull).filter(e -> e.equals(tipo)).count();
	}

	// Ejercicio 3 — Contador de pasos en el Laberinto
	public static Integer pasosLaberinto(List<Integer> pasos) {
		return pasos.stream().takeWhile(e -> e > 0).reduce(0, (a, b) -> a + b);
	}

	// Ejercicio 4 — Nivel medio de magia en las calabazas
	public static Double promedioMagia1(List<Integer> niveles) {
		Integer numMayores = 0;
		Double sum = 0.;
		
		for (Integer nivel : niveles) {
			if (nivel >= 5) {
				sum += nivel;
				numMayores++;
			}
		}

		return sum / numMayores;
	}

	public static Double promedioMagia2(List<Integer> niveles) {
		Integer numMayores = 0;
		Double sum = 0.;
		
		for (int i = 0; i < niveles.size(); i++) {
			if (niveles.get(i) >= 5) {
				sum += nivels.get(i);
				numMayores++;
			}
		}

		return sum / numMayores;
	}

	public static Double promedioMagia3(List<Integer> niveles) {
		Integer numMayores = 0;
		Double sum = 0.;
		
		Integer i = 0;
		while (i < niveles.size()) {
			if (niveles.get(i) >= 5) {
				sum += niveles.get(i);
				numMayores++;
			}
			 i++;
		}
		return sum / numMayores;
	}
}
