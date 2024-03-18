package main.java.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {
    
    /**
     * Brute force approach:
     * Time: O(n)
     * Space: O(n)
     */
    public static void moveZerosToEnd1(int[] arr) {
        int zeroCount = 0;
        List<Integer> list = new ArrayList<>();
        for(int e: arr) {
            if(e == 0) zeroCount++;
            else list.add(e);
        }
        while (zeroCount != 0) {
            list.add(0);
            zeroCount--;
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
    
    /**
     * Alternative approach:
     * Time: O(n^2)
     * Space: O(1)
     */
    public static void moveZerosToEnd2(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                int curr = i;
                while(curr <= arr.length - 2) {
                    arr[curr] = arr[++curr];
                }
                arr[arr.length - 1] = 0;
            }
        }
    }
    
    /**
     * Optimal approach:
     * Time: O(n)
     * Space: O(1)
     */
    public static void moveZerosToEnd3(int[] arr) {
        int i = 0;
        int j = -1;
        for(int k = 0; k < arr.length; k++) {
            if(arr[k] == 0) {
                j = k;
                i = k + 1;
                break;
            }
        }
        if(j == -1) return;
        while(i < arr.length) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
            i++;
        }
    }
    
    public static void main(String[] args) {
        int[] array = {13,0,52,0,9,46};
        System.out.println(Arrays.toString(array));
        moveZerosToEnd3(array);
        System.out.println(Arrays.toString(array));
    }
}
