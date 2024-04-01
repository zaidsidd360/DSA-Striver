package main.java.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElements {
    
    // Brute force approach
    public static int[] rearrangeAlternatively1(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int e: arr) {
            if(e < 0) neg.add(e);
            else pos.add(e);
        }
        int j = 0;
        for(int i = 0; i < arr.length; i += 2) {
            arr[i] = pos.get(j);
            arr[i+1] = neg.get(j++);
        }
        return arr;
    }
    
    // Optimal approach
    public static int[] rearrangeAlternatively2(int[] arr) {
        int[] res = new int[arr.length];
        int posIndex = 0;
        int negIndex = 1;
        for(int e: arr) {
            if(e < 0) {
                res[negIndex] = e;
                negIndex += 2;
            } else {
                res[posIndex] = e;
                posIndex += 2;
            }
        }
        return res;
    }
    
    /*
     Sub-problem where the number of +ve and -ve elements are not equal. Problem asks
     to simply add the remaining +ve/-ve elements without alternating.
    */
    public static int[] rearrangeAlternativelyType2(int[] arr) {
        int[] res = new int[arr.length];
        int posIndex = 0, negIndex = 1;
        int posCount = 0, negCount = 0;
        int remValueIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                res[negIndex] = arr[i];
                negIndex += 2;
                negCount++;
            } else {
                res[posIndex] = arr[i];
                posIndex += 2;
                posCount++;
            }
            remValueIndex = i + 1;
            if(posCount == negCount) break;
        }
        while (remValueIndex < res.length) {
            res[remValueIndex] = arr[remValueIndex++];
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] array = {3,1,-2,-5,2,-4,8,6,23};
        System.out.println(Arrays.toString(rearrangeAlternativelyType2(array)));
    }
}
