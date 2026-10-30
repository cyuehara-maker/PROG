package ejercicios;

import java.util.List;

import utiles.Utiles;

public class Ejercicios {

	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) {

		if (edad < 0) {
			return -1;
		}

		Integer precioBase = null;

		switch (dia) {
		case "LUNES", "MARTES", "MIERCOLES", "JUEVES":
			precioBase = 8;
			break;
		case "VIERNES":
			precioBase = 10;
			break;
		case "SABADO", "DOMINGO":
			precioBase = 12;
			break;
		default:
			return -1;
		}

		if (edad < 12 || edad >= 65) {
			precioBase -= 3;
		}

		if (socio) {
			precioBase -= 2;
		}

		return precioBase;
	}

	public static void dibujarZ(Integer lado) {
		for (int i = 0; i < lado; i++) { // recorrer filas, hacer la siguiente linea
			for (int j = 0; j < lado; j++) { // recorrer columnas
				if (i == 0 || i == lado - 1 || i + j == lado - 1) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

	public static Integer sumaPrimerosEspeciales(Integer inicio, Integer fin, Integer cantidad) {

		Integer sum = 0;
		Integer count = 0;

		for (int i = inicio; i <= fin; i++) {
			if (Utiles.isPrime(i) || Utiles.isPerfect(i)) {
				sum += i;
				count++;
			}
			if (count == cantidad) {
				break;
			}
		}

		return sum;
	}

	public static Integer factorialConSaltos(Integer numero, Integer salto) {

		// caso base
		// número es menor o igual a 0
		// return 1 para no afectar la multiplicación
		if (numero <= 0) {
			return 1;
		}

		// multiplicar número por (número - salto) recursivamente
		// se mantiene el salto para la siguiente llamada
		return numero * factorialConSaltos(numero - salto, salto);
	}

	public static Integer contarPicos(List<Integer> alturas, Integer diferenciaMinima) {

		Integer count = 0;

		for (int i = 1; i < alturas.size() - 1; i++) {
			Integer middle = alturas.get(i);
			Integer left = alturas.get(i - 1) + diferenciaMinima;
			Integer right = alturas.get(i + 1) + diferenciaMinima;
			if (middle >= left && middle >= right) {
				count++;
			}
		}

		return count;
	}

	public static Integer primeraPosicionSumaCifras(List<Integer> numeros, Integer sumaObjetivo) {

		Integer res = -1;

		Integer index = 0;
		while (index < numeros.size()) {
			Integer sum = Utiles.sumUnits(numeros.get(index));
			if (sumaObjetivo.equals(sum)) {
				res = index;
				break;
			}
			index++;
		}

		return res;
	}

	public static Integer countNonOverlapingPairs(List<Integer> numbers) {

		if (numbers.isEmpty()) {
			return 0;
		}

		Integer count = 0;
		Integer index = 1;
		while (index < numbers.size()) {

			Integer sum = numbers.get(index - 1) + numbers.get(index);
			if (sum % 5 == 0) {
				count++;
				index += 2;
			} else {
				index++;
			}
		}

		return count;
	}
}
