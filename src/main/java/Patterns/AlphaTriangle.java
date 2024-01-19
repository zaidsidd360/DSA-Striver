package main.java.Patterns;

import java.util.Scanner;

public class AlphaTriangle {

    public static void printAlphaTriangle(int N) {
        for(int i = 0; i < N; i++) {
            int charCode = 64 - i + N;
            for(int j = 0; j <= i; j++) {
                System.out.print((char) charCode++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = s.nextInt();
        if(N < 1) System.out.println("N must be greater than 0!");
        else printAlphaTriangle(N);
    }
}
