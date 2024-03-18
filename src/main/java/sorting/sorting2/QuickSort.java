package main.java.sorting.sorting2;

import main.java.sorting.Swapper;
import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int partitionIndex = findPartitionIndex(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int findPartitionIndex(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while(arr[j] >= pivot && j >= low + 1) {
                j--;
            }
            if(i < j) {
                Swapper.swap(arr, i, j);
            }
        }
        Swapper.swap(arr, low, j);
        return j;
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
