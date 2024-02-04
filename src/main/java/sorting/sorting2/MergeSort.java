package main.java.sorting.sorting2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void mergeSort(int[] arr, int low, int high) {
        if(low >= high) return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }
        while(left <= mid) {
            temp.add(arr[left++]);
        }
        while(right <= high) {
            temp.add(arr[right++]);
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
