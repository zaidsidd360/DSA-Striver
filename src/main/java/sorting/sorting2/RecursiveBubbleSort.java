package main.java.sorting.sorting2;

import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void recursiveBubbleSort(int[] arr, int i) {
        if(i >= arr.length) return;

        for(int j = i + 1; j < arr.length; j++)
            if(arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        recursiveBubbleSort(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        recursiveBubbleSort(array, 0);
        System.out.println(Arrays.toString(array));
    }

}
