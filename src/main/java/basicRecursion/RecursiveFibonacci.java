package main.java.basicRecursion;

public class RecursiveFibonacci {

    public static void printFibonacci(int n, int first, int second) {
        if(n <= 2) return;

        if(first == 0)
            System.out.print(first + " " + second + " ");

        int next = first + second;
        System.out.print(next + " ");
        printFibonacci(n - 1, second, next);
    }

    public static int fibonacci(int n) {
        if(n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        printFibonacci(10, 0, 1);
        System.out.println();
        for(int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
