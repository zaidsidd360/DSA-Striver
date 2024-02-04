package main.java.sorting.sorting1;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

}
