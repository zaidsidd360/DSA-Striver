package main.java.arrays.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DedupeSortedArray {

    public static int[] deDupeSortedArray(int[] arr) {
        int k = 0; // Index for the unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[k]) {
                arr[++k] = arr[i]; // Shift unique elements to the left
            }
        }
        return Arrays.copyOf(arr, k + 1);
    }

    public static Integer[] deDupeSortedArray2(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int e: arr) {
            set.add(e);
        }
        int i = 0;
        for(int v: set) {
            arr[i++] = v;
        }
        return set.toArray(new Integer[set.size()]);
    }

    public static void main(String[] args) {
        int[] array = {1,2,2,2,3,4,5,6,6,7,8,9};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(deDupeSortedArray2(array)));
    }
}
