package main.java.arrays.easy;

public class MaxConsecutiveOnes {
    
    public static int findMaxConsecutiveOnes(int[] arr) {
        int currCount = 0;
        int maxCount = 0;
        for(int e: arr) {
            if(e == 1) {
                currCount++;
                maxCount = Math.max(currCount, maxCount);
            } else {
                currCount = 0;
            }
        }
        return maxCount;
    }
    
    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,0,0,1,1,0,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(array));
    }
}
