package main.java.arrays.easy;

public class MissingNumber {
    
    public static int findMissingNumber1(int[] arr, int n) {
        int arrIndex = 0;
        for(int i = 1; i <= n; i++) {
            if(arr[arrIndex++] != i) {
                return i;
            }
        }
        return -1;
    }
    
    public static int findMissingNumber2(int[] arr, int n) {
        int naturalSum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for(int e: arr) {
            arraySum += e;
        }
        return naturalSum - arraySum;
    }
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7};
        int n = 7;
        System.out.println(findMissingNumber2(array, n));
    }
}
