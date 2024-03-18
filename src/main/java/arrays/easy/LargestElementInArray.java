package main.java.arrays.easy;

public class LargestElementInArray {

    public static int findLargestElementBruteForce(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int element: arr)
            largest = Math.max(element, largest);
        return largest;
    }

    public static int findLargestElementRecursive(int[] arr, int n, int largest) {
        if(n >= arr.length) return largest;
        int currLargest = Math.max(arr[n], largest);
        return findLargestElementRecursive(arr, n + 1, currLargest);
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        System.out.println(findLargestElementRecursive(array, 0, Integer.MIN_VALUE));
    }

}
