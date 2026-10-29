package fibonacci;

import java.math.BigInteger;

public class Fibonacci {

    // recursion
    public static long recursive(int n) {

        if (n <= 1) {
            return (long) n;
        }

        return recursive(n - 1) + recursive(n - 2);
    }

    // memoization
    public static BigInteger memo(int n) {

        if (n <= 1) {
            return BigInteger.valueOf(n);
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger sum = null;
        for (int i = 1; i < n; i++) {
            sum = a.add(b);
            a = b;
            b = sum;
        }

        return sum;
    }

    // matrix
    static public BigInteger matrix(int n) {

        M2X2 fib = new M2X2(BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE);
        M2X2 step = new M2X2(BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.ONE);

        for(int i = 0; i < n; i++) {
            fib = fib.multiply(step);
        }

        return fib.getE00();
    }
}