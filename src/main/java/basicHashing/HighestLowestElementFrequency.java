package main.java.basicHashing;

import java.util.HashMap;
import java.util.Map;

public class HighestLowestElementFrequency {

    public static void printHighestLowestElementFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int element : arr) {
            if(map.containsKey(element))
                map.put(element, map.get(element) + 1);
            else
                map.put(element, 1);
        }

        int lowestFreq = Integer.MAX_VALUE;
        int highestFreq = Integer.MIN_VALUE;
        int lowestFreqElement = 0;
        int highestFreqElement = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int currFreq = entry.getValue();
            int currElement = entry.getKey();
            if(currFreq < lowestFreq) {
                lowestFreq = currFreq;
                lowestFreqElement = currElement;
            }
            if(currFreq > highestFreq) {
                highestFreq = currFreq;
                highestFreqElement = currElement;
            }
        }

        System.out.println(highestFreqElement + " occurs the most.");
        System.out.println(lowestFreqElement + " occurs the least.");
    }

    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        printHighestLowestElementFrequency(arr);
    }
}
