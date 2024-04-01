package main.java.arrays.medium;

public class BuyAndSellStock {
    // Brute force approach
    public static int findMaxProfit1(int[] arr) {
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                maxProfit = Math.max(arr[j] - arr[i], maxProfit);
            }
        }
        return Math.max(maxProfit, 0);
    }
    
    // Optimal approach
    public static int findMaxProfit2(int[] arr) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int e: arr) {
            if(e < minPrice) minPrice = e;
            if(e - minPrice > maxProfit) maxProfit = e - minPrice;
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        System.out.println(findMaxProfit2(array));
    }
}
