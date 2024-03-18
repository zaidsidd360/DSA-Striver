package main.java.sorting.sorting2;

import main.java.sorting.Swapper;

import java.util.Arrays;

public class RecursiveSelectionSort {

    public static void recursiveSelectionSort(int[] arr, int i) {
        if(i >= arr.length - 1) return;

        int minValIndex = i;
        for(int j = i + 1; j < arr.length; j++)
            if(arr[j] < arr[minValIndex])
                minValIndex = j;
        Swapper.swap(arr, i, minValIndex);
        recursiveSelectionSort(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        recursiveSelectionSort(array, 0);
        System.out.println(Arrays.toString(array));
    }
}
