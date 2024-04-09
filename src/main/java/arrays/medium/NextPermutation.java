package main.java.arrays.medium;

import main.java.arrays.Utils;
import main.java.sorting.Swapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    
    public static void findAllPermutations(
            int[] arr, List<Integer> ds,
            List<List<Integer>> permutations, boolean[] isAvailable
    ) {
        // Base condition
        if(ds.size() == arr.length) {
            permutations.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            if(!isAvailable[i]) {
                isAvailable[i] = true;
                ds.add(arr[i]);
                findAllPermutations(arr, ds, permutations, isAvailable);
                ds.remove(ds.size() - 1);
                isAvailable[i] = false;
            }
        }
    }
    
    // Brute force approach
    public static int[] findNextPermutation1(int[] arr) {
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isAvailable = new boolean[arr.length];
        // -> findAllPermutations <- is the main algorithm which finds out all possible permutations
        findAllPermutations(arr, ds, permutations, isAvailable);
        permutations.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        for(int i = 0; i < permutations.size(); i++) {
            List<Integer> currPermutation = permutations.get(i);
            List<Integer> nextPermutation = (i < permutations.size() - 1) ? permutations.get(i + 1) : permutations.get(0);
            if(Arrays.equals(arr, Utils.convertToArray(currPermutation))) {
                return Utils.convertToArray(nextPermutation);
            }
        }
        return new int[0];
    }
    
    // Optimal approach
    public static int[] findNextPermutation2(int[] arr) {
        int breakPoint = -1;
        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] < arr[i + 1]) {
                breakPoint = i;
                break;
            }
        }
        if(breakPoint != -1) {
            for(int j = arr.length - 1; j > breakPoint; j--) {
                if(arr[j] > arr[breakPoint]) {
                    Swapper.swap(arr, j, breakPoint);
                    break;
                }
            }
            Utils.reverseArray(arr, breakPoint + 1, arr.length - 1);
        } else Utils.reverseArray(arr, 0, arr.length - 1);
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(Arrays.toString(findNextPermutation2(arr)));
    }
}
