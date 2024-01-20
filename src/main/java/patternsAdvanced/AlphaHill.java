package main.java.patternsAdvanced;

import java.util.Scanner;

public class AlphaHill {

    public static void printAlphaHill(int N) {
        for(int i = 1; i <= N; i++) {
            // Spaces
            for(int s = 0; s < N - i; s++) {
                System.out.print(" ");
            }
            // Hill
            int charCode = 65;
            for(int h = 1; h <= i * 2 - 1; h++) {
                System.out.print(
                        h < i
                        ? (char) charCode++
                        : (char) charCode--
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
        else printAlphaHill(N);
    }
}
