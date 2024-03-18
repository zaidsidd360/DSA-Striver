package main.java.arrays.easy;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {
    
    public static void leftRotateArrayByOnePlace(int[] arr) {
        int firstElement = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = firstElement;
    }
    
    public static void main(String[] args) {
        int[] array = {13,24,52,20,9,46};
        System.out.println(Arrays.toString(array));
        leftRotateArrayByOnePlace(array);
        System.out.println(Arrays.toString(array));
    }
}
