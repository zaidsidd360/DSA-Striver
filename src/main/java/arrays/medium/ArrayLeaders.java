package main.java.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {
    // Brute force approach
    public static void printArrayLeaders1(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            boolean isGreater = true; // assuming the current element is greater than all elements to its right
            for(int j = i + 1; j < arr.length; j++) {
                if(curr < arr[j]) {
                    isGreater = false;
                    break;
                }
            }
            if(isGreater) leaders.add(curr);
        }
        System.out.println(leaders);
    }
    
    // Optimal approach
    public static void printArrayLeaders2(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int max = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] > max || i == arr.length - 1) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        System.out.print("[");
        for(int j = leaders.size() - 1; j >= 0; j--) {
            System.out.print(j == 0 ? leaders.get(j) : leaders.get(j) + ", ");
        }
        System.out.print("]");
    }
    
    public static void main(String[] args) {
        int[] array = {10, 22, 12, 3, 0, 6};
        printArrayLeaders2(array);
    }
}
