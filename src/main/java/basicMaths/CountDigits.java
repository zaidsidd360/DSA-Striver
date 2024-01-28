package main.java.basicMaths;

public class CountDigits {

    public static int countDigits(int n) {
        int sumOfDigitsThatDivideN = 0;
        int temp = n;
        while(temp > 0) {
            int currDigit = temp % 10;
            if(currDigit != 0 && n % currDigit == 0)
                sumOfDigitsThatDivideN++;
            temp /= 10;
        }
        return sumOfDigitsThatDivideN;
    }

    public static void main(String[] args) {
        int n = 336;
        System.out.println(countDigits(n));
    }
}
