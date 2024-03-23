package main.java.arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public static int[] findTwoSum(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
    
    public static int[] findTwoSum2(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                return new int[] {map.get(arr[i]), i};
            } else map.put(target - arr[i], i);
        }
        System.out.println(map);
        return new int[] {-1, -1};
    }
    
    public static void main(String[] args) {
        int[] array = {2,6,5,8,11};
        int[] res = findTwoSum2(array, 39);
        System.out.println(Arrays.toString(res));
    }
}
