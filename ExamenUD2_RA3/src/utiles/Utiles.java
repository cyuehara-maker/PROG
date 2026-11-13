package utiles;

import java.util.List;

public class Utiles {

	public static Integer contarDivisores(Integer n) {

		Integer divisores = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				divisores++;
			}
		}

		return divisores;
	}

	public static Integer sumarVentana(List<Integer> ventas) {

		Integer sum = 0;

		for (Integer i : ventas) {
			sum += i;
		}

		return sum;
	}

	public static Boolean alternatesAreEvenOrOdd(List<Integer> numbers, Integer index) {

		Integer aux = numbers.get(0) % 2;

		for (int i = 0; i < numbers.size(); i += 2) {
			if (numbers.get(i) % 2 != aux) {
				return false;
			}
		}
		
		return true;
	}
}
