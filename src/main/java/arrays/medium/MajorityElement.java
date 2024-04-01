package main.java.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    // Brute force approach
    public static int findMajorityElement1(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == arr[i]) {
                    count++;
                }
            }
            if(count > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }
    
    // Better approach
    public static int findMajorityElement2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int e: arr) {
            if(map.containsKey(e)) map.put(e, map.get(e) + 1);
            else map.put(e, 1);
        }
        for(Integer key: map.keySet()) {
            if(map.get(key) > arr.length / 2) return key;
        }
        return -1;
    }
    
    // Optimal - Moore's/Boyer-Moore voting algorithm
    /* Explanation:
        The key idea behind Moore's Voting Algorithm is that if an element appears
        more than half the times, it will "outweigh" all other elements during the count adjustments.
        Here's why:
            1. For any non-majority element, its occurrences will be balanced out by its own
            duplicates or other elements in the array when the count is incremented for
            another candidate and then decremented when encountering a different element.
            2. The majority element, however, will have more occurrences than any other element
            and will eventually lead to a positive count value after the entire array is traversed.
     */
    public static int findMajorityElement3(int[] arr) {
        int element = arr[0];
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                count++;
            } else {
                count--;
            }
            if(count == 0 && i != arr.length - 1) {
                element = arr[i + 1];
            }
        }
        int freq = 0;
        for(int e: arr) {   
            if(e == element) freq++;
        }
        if(freq > arr.length / 2) {
            return element;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] array = {4,4,2,4,3,4,4,3,2,4};
        System.out.println(findMajorityElement3(array));
    }
}
