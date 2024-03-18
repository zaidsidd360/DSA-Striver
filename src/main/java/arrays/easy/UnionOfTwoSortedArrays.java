package main.java.arrays.easy;

import java.util.*;

public class UnionOfTwoSortedArrays {
    
    public static int[] findUnion1(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new TreeSet<>();
        for(int val: arr1) {
            unionSet.add(val);
        }
        for(int val: arr2) {
            unionSet.add(val);
        }
        int[] res = new int[unionSet.size()];
        int i = 0;
        for(int item: unionSet) {
            res[i++] = item;
        }
        return unionSet.stream().mapToInt(item -> item).toArray();
    }
    
    public static int[] findUnion2(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]) {
                if(list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else  {
                if(list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        if(i < arr1.length) {
            for(int k = i; k < arr1.length; k++) {
                if(list.isEmpty() || list.get(list.size() - 1) != arr1[k]) {
                    list.add(arr1[k]);
                }
            }
        } else if(j < arr2.length) {
            for(int k = j; k < arr2.length; k++) {
                if(list.isEmpty() || list.get(list.size() - 1) != arr2[k]) {
                    list.add(arr2[k]);
                }
            }
        }
        return list.stream().mapToInt(val -> val).toArray();
    }
    
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {2,3,4,4,5,11,12};
        int[] result = findUnion2(array1, array2);
        System.out.println(Arrays.toString(result));
    }
}
