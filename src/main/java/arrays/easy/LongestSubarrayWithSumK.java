package main.java.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    // Brute force approach
    public static int findLongestSubarrayWithSumK(int[] arr, int k) {
        int longestSubarrayLength = 0;
        for(int i = 0; i < arr.length; i++) {
            int currSum = arr[i];
            int currLength = 1;
            for(int j = i; j < arr.length; j++) {
                currSum += arr[j];
                currLength++;
                if(currSum == k) {
                    longestSubarrayLength = Math.max(longestSubarrayLength, currLength);
                }
            }
        }
        return longestSubarrayLength;
    }
    
    // Hashing/Prefix sum approach - works for both +ve and -ve numbers.
    public static int findLongestSubarrayWithSumK2(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }
            if(map.containsKey(sum - k)) {
                maxLength =  Math.max(maxLength, i - map.get(sum - k));
            }
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
    
    // Sliding window approach - Optimal (but works for only +ve numbers)
    public static int findLongestSubarrayWithSumK3(int[] arr, int k) {
        int sum = 0;
        int maxLength = 0;
        int i = 0;
        int j = 0;
        while(i < arr.length) {
            sum += arr[i];
            while(sum > k && j <= i) {
                sum -= arr[j++];
            }
            if (sum == k) {
                int currWindowSize = i - j + 1;
                maxLength = Math.max(maxLength, currWindowSize);
            }
            i++;
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        int[] array = {1,2,3,1,1,1,1,3,3};
        System.out.println(findLongestSubarrayWithSumK(array, 6));
    }
}
