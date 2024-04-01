package main.java.arrays.medium;

import java.util.Arrays;
import main.java.sorting.Swapper;

public class SortArrayOfZeroOneTwo {
    
    // Brute force approach: Basic sorting with any algorithm
    
    // Better approach:
    public static void sortArrayOfZeroOneTwo(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for(int e: arr) {
            if(e == 0) count0++;
            else if (e == 1) count1++;
            else count2++;
        }
        for(int i = 0; i < arr.length; i++) {
            if(i < count0) arr[i] = 0;
            else if(i < (count0 + count1)) arr[i] = 1;
            else arr[i] = 2;
        }
    }
    
    // Optimal - Dutch National Flag (DNF) / 3-way-partition algorithm approach:
    public static void sortArrayOfZeroOneTwo2(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while(mid <= high) {
            if(arr[mid] == 0) {
                Swapper.swap(arr, mid, low);
                mid++;
                low++;
            } else if(arr[mid] == 1) {
                mid++;
            } else {
                Swapper.swap(arr, mid, high);
                high--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] array = {0,1,2,0,1,2,1,2,0,0,0,1};
        sortArrayOfZeroOneTwo2(array);
        System.out.println(Arrays.toString(array));
    }
}
