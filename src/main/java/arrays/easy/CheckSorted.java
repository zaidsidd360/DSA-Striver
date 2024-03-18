package main.java.arrays.easy;

public class CheckSorted {

    public static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] < arr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {13,24,52,20,9,46};
//        int[] array = {1,2,2,2,3,4,5,6,6,7,8,9};
        System.out.println(isSorted(array));
    }
}
