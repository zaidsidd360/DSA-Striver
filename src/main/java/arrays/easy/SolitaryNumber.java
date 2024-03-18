package main.java.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class SolitaryNumber {
    
    // Not suitable for arrays containing -ve values.
    public static int findSolitaryNumber1(int[] arr) {
        // find maximum
        int max = Integer.MIN_VALUE;
        for(int val: arr)
            max = Math.max(max, val);
        
        int[] freqArr = new int[max + 1];
        // update each elements frequency in freqArr
        for(int e: arr) {
            freqArr[e]++;
        }
        for(int e: arr) {
            if(freqArr[e] == 1) return e;
        }
        return -1;
    }
    
    public static int findSolitaryNumber2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int e: arr) {
            if(map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else map.put(e, 1);
        }
        
        for(int e: map.keySet()) {
            if(map.get(e) == 1) return e;
        }
        return -1;
    }
    
    public static int findSolitaryNumber3(int[] arr) {
        int xor = 0;
        for(int e: arr) {
            xor = xor ^ e;
        }
        return xor;
    }
    
    public static void main(String[] args) {
        int[] array = {4,1,2,1,2};
        System.out.println(findSolitaryNumber3(array));
    }
}
