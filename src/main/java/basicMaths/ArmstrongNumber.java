package main.java.basicMaths;

public class ArmstrongNumber {

    public static boolean checkArmstrong(int n) {
        int digits = Integer.toString(n).length();
        int sum = 0;
        int temp = n;
        while(temp > 0) {
            int rem = temp % 10;
            sum += (int) Math.pow(rem, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(checkArmstrong(n));
    }
}
