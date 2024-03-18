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

    public static void fibonacci(int n) {
        printFibonacci(n, 0, 1);
    }

    public static void main(String[] args) {
        fibonacci(10);
    }

}
