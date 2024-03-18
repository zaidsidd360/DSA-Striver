package main.java.sorting.sorting2;

import main.java.sorting.Swapper;

import java.util.Arrays;

public class RecursiveInsertionSort {

    public static void recursiveInsertionSort(int[] arr, int i) {
        if(i >= arr.length) return;

        int j = i;
        while(j > 0 && arr[j - 1] > arr[j]) {
            Swapper.swap(arr, j, j - 1);
            j--;
        }
        recursiveInsertionSort(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        recursiveInsertionSort(array, 0);
        System.out.println(Arrays.toString(array));
    }
}
