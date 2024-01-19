package main.java.Patterns;

import java.util.Scanner;

public class BinaryNumberTriangle {

    public static void printBinaryNumberTriangle(int N) {
        for(int i = 0; i < N; i++) {
            // If the current row is odd - initialize `val` to 1
            // otherwise - initialize `val` to 0
            int val = i % 2 == 0 ? 0 : 1;
            for(int j = 0; j < i; j++) {
                System.out.print(val + " ");
                // Toggles the value of `val` from 1 to 0
                // and vice versa.
                val = val == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = s.nextInt();
        if(N < 1) System.out.println("N must be greater than 0!");
        else printBinaryNumberTriangle(N);
    }
}