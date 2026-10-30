package utiles;

public class Utiles {
	public static Boolean isPrime(Integer n) {
		
		Boolean isPrime = true;
		
		if (n == 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
	
	public static Boolean isPerfect(Integer n) {
		
		Integer sum = 0;
		
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		
		return sum.equals(n);
	}
	
	public static Integer sumUnits(Integer n) {
		
		Integer sum = 0;
		
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
}
