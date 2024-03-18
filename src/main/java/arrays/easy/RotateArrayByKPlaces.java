package main.java.arrays.easy;


import java.util.Arrays;

public class RotateArrayByKPlaces {
    
    public static void rotateArray(int[] arr, int places, String direction) {
        int effectiveRotation = places > arr.length ? places % arr.length : places;
        if (effectiveRotation == 0) // Handle zero rotation
            return;
        
        if ("left".equalsIgnoreCase(direction))
            leftRotate(arr, effectiveRotation);
        else if ("right".equalsIgnoreCase(direction))
            rightRotate(arr, effectiveRotation);
        else
            throw new IllegalArgumentException("Invalid direction: " + direction + ", " +
                    "Allowed directions: \"left\" or \"right\"."); // Handle invalid direction
    }
    
    public static void rightRotate(int[] arr, int places) {
        int[] tempArr = new int[places];
        int index = 0;
        for(int i = arr.length - places; i < arr.length; i++)
            tempArr[index++] = arr[i];
        
        for(int j = arr.length - places - 1; j >= 0; j--) {
            int currElement = arr[j];
            arr[j + places] = currElement;
        }
        
        for(int k = 0; k < places; k++)
            arr[k] = tempArr[k];
    }
    
    public static void leftRotate(int[] arr, int places) {
        int[] tempArr = new int[places];
        for(int i = 0; i < places; i++)
            tempArr[i] = arr[i];
        
        for(int j = places; j < arr.length; j++) {
            int currElement = arr[j];
            arr[j - places] = currElement;
        }
        
        int index = 0;
        for(int k = arr.length - places; k < arr.length; k++)
            arr[k] = tempArr[index++];
    }
    
    public static void main(String[] args) {
        int[] array = {13,24,52,20,9,46};
        System.out.println(Arrays.toString(array));
        rotateArray(array, 2, "right");
        System.out.println(Arrays.toString(array));
    }
}
