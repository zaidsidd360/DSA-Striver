package main.java.arrays;

import main.java.sorting.Swapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Utils {
    public static int[] convertToArray(List<Integer> list) {
        return list
                .stream()
                .mapToInt(val -> val)
                .toArray();
    }
    
    public static ArrayList<Integer> convertToList(int[] arr) {
        return (ArrayList<Integer>) IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());
    }
    
    public static void reverseArray(int[] arr, int from, int to) {
        int i = from, j = to;
        while(i <= j) {
            Swapper.swap(arr, i, j);
            i++;
            j--;
        }
    }
}
