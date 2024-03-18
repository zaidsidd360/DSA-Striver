package main.java.sorting.sorting1;

import main.java.sorting.Swapper;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minValIndex = i;
            for(int j = i + 1; j < arr.length; j++)
                if(arr[j] < arr[minValIndex])
                    minValIndex = j;
            Swapper.swap(arr, i, minValIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
