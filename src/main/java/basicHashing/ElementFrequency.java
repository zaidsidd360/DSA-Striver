package main.java.basicHashing;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {

    public static void printElementFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int element : arr) {
            if(map.containsKey(element))
                map.put(element, map.get(element) + 1);
            else
                map.put(element, 1);
        }

        for(Map.Entry<Integer, Integer>  e: map.entrySet()) {
            System.out.println(e.getKey() + " occurs " + e.getValue() + (e.getValue() == 1 ? " time." : " times."));
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        printElementFrequency(arr);
    }
}
