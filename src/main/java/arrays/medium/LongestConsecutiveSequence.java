package main.java.arrays.medium;

import main.java.sorting.sorting2.QuickSort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    // Brute force
    
    
    // Better approach
    public static int findLongestConsecutiveSequenceLength(int[] arr) {
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int max = 1;
        int count = 0;
        int lastSelected = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if(curr - 1 == lastSelected) {
                lastSelected = curr;
                count++;
            } else if(curr != lastSelected) {
                lastSelected = curr;
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    
    // Optimal approach
    public static int findLongestConsecutiveSequenceLength2(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int max = 1;
        for(int num : set) {
            if(!set.contains(num - 1)) {
                int curr = num;
                int currCount = 1;
                while(set.contains(curr + 1)) {
                    curr += 1;
                    currCount += 1;
                }
                max = Math.max(currCount, max);
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] array = {100, 101, 100, 2, 2, 2, 3, 4, 3, 5, 6};
        System.out.println(findLongestConsecutiveSequenceLength2(array));
    }
}
