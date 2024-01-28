package main.java.basicRecursion;

public class RecursivePalindrome {

    public static boolean checkPalindrome(String str, int i, int j) {
        // Base condition
        if(i >= j) return true;

        if(str.charAt(i) != str.charAt(j)) return false;

        return checkPalindrome(str, ++i, --j);
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(checkPalindrome(str, 0, str.length() - 1));
    }
}
