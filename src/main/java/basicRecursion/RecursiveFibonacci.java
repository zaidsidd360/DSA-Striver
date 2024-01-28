package main.java.basicRecursion;

public class RecursiveFibonacci {

    public static void printFibonacci(int n, int i, int first, int second) {
        if(i == n - 1) return;

        if(i == 1)
            System.out.print(first + " " + second + " ");

        int next = first + second;
        System.out.print(next + " ");
        printFibonacci(n, i + 1, second, next);
    }

    public static void main(String[] args) {
        printFibonacci(10, 1, 0, 1);
    }
}
