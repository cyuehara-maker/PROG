package test;

import fibonacci.Fibonacci;

public class Test {
    public static void main(String[] args) {
        
        System.out.println("recursive");
        System.out.println(Fibonacci.recursive(9));
        
        System.out.println("\nmemoization");
        System.out.println(Fibonacci.memo(99999));

        System.out.println("\nmatrix");
        System.out.println(Fibonacci.matrix(99999));
    }
}
