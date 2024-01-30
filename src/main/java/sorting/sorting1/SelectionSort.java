package main.java.sorting.sorting1;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[smallestIndex]) smallestIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
