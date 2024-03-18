package main.java.sorting.sorting1;

import main.java.sorting.Swapper;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            /* Optimization for best case scenario - If no swap takes
            place in the first iteration of the outer loop, that means
            the given array is already sorted, and we break out of the loop.
            Best case time complexity - O(n)
            */
            boolean didSwap = false;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    Swapper.swap(arr, i, j);
                    didSwap = true;
                }
            }
            if(!didSwap) break;
        }
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}
