package main.java.arrays.medium;

public class MaximumSubarraySum {
    
    // Brute force approach
    public static int findMaxSubarrSum1(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for(int j = i; j < arr.length; j++) {
                currSum += arr[j];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }
    
    // Optimal - Kadane's algorithm
    public static int findMaxSubarrSum2(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int e : arr) {
            currSum += e;
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return Math.max(maxSum, 0);
    }
    
    public static int findMaxSubarrSumAndPrintMaxSubarr(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0;
        int arrSt = -1, arrEn = -1;
        for(int i = 0; i < arr.length; i++) {
            if(currSum == 0) start = i;
            currSum += arr[i];
            if(currSum > maxSum) {
                maxSum = currSum;
                arrSt = start;
                arrEn = i;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.print("[");
        for(int i = arrSt; i <= arrEn; i++) {
            System.out.print(i == arrEn ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
        return Math.max(maxSum, 0);
    }
    
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSubarrSumAndPrintMaxSubarr(array));
    }
}
