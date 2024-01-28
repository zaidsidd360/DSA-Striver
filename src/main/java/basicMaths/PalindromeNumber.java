package main.java.basicMaths;

public class PalindromeNumber {

    public static boolean checkPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        int n = 51415;
        System.out.println(checkPalindrome(n));
    }
}
