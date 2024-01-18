package main.java.Patterns;

import java.util.Scanner;

public class NumberCrown {

    public static void printNumberCrown(int N) {
        for(int i = 1; i <= N; i++) {
            // Left pyramid
            for(int lp = 1; lp <= i; lp++) {
                System.out.print(lp);
            }
            // Spaces
            for(int s = 1; s <= (2 * N - 2 * i); s++) {
                System.out.print(" ");
            }
            // Right pyramid
            for(int rp = i; rp >= 1; rp--) {
                System.out.print(rp);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = s.nextInt();
        printNumberCrown(N);
    }
}
