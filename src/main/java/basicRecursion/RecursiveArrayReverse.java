package main.java.basicRecursion;

import main.java.sorting.Swapper;

import java.util.Arrays;

public class RecursiveArrayReverse {

    public static void reverseArrayRecursive(int[] arr, int i, int j) {
        // Base condition
        if(i >= j) return;
        
        Swapper.swap(arr, i, j);
        reverseArrayRecursive(arr, ++i, --j);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Before reversing: " + Arrays.toString(arr));
        reverseArrayRecursive(arr, 0, arr.length - 1);
        System.out.println("After reversing: " + Arrays.toString(arr));
    }
}
