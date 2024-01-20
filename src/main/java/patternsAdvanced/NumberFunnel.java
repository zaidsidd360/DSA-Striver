package main.java.patternsAdvanced;

import java.util.Scanner;

public class NumberFunnel {

    public static void printNumberFunnel(int N) {
        for(int i = 0; i < 2 * N - 1; i++) {
            for(int j = 0; j < 2 * N - 1; j++) {
                int top = i;
                int bottom = j;
                int right = (2  *N - 2) - j;
                int left = (2 * N - 2) - i;

                System.out.print(N - Math.min(
                        Math.min(top,bottom),
                        Math.min(left,right))
                        + " "
                );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = s.nextInt();
        if(N < 1) System.out.println("N must be greater than 0!");
        else printNumberFunnel(N);
    }
}
