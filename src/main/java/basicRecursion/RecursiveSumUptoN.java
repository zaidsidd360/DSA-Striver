package main.java.basicRecursion;

public class RecursiveSumUptoN {

    public static void printSumRecursive(int n, int sum) {
        // Base condition
        if(n < 1) {
            System.out.println(sum);
            return;
        }
        printSumRecursive(n - 1, sum + n);
    }

    public static void main(String[] args) {
        int n = 100;
        printSumRecursive(n, 0);
    }

}
