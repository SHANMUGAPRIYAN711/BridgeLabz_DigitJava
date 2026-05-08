package Searching;

public class FibonacciComparison {

    // Recursive
    public static int fibonacciRecursive(int n) {

        if (n <= 1)
            return n;

        return fibonacciRecursive(n - 1)
                + fibonacciRecursive(n - 2);
    }

    // Iterative
    public static int fibonacciIterative(int n) {

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {

            sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }

    public static void main(String[] args) {

        int n = 40;

        // Recursive
        long start1 = System.nanoTime();

        fibonacciRecursive(n);

        long end1 = System.nanoTime();

        System.out.println("Recursive Time: "
                + (end1 - start1));

        // Iterative
        long start2 = System.nanoTime();

        fibonacciIterative(n);

        long end2 = System.nanoTime();

        System.out.println("Iterative Time: "
                + (end2 - start2));
    }
}