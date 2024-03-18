package main.java.arrays.easy;

public class SecondLargestElementInArray {

    public static int findSecondLargestElement(int[] arr) {
        int largest = 0;
        int secondLargest = 0;
        for(int e: arr) {
            if(e > largest) {
                secondLargest = largest;
                largest = e;
            } else if(e > secondLargest) {
                secondLargest = e;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {13,24,52,20,9,46};
        System.out.println(findSecondLargestElement(array));
    }
}
