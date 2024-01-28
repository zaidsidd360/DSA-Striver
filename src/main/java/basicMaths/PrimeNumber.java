package main.java.basicMaths;

public class PrimeNumber {

    public static boolean checkPrime(int n) {
        int factors = 1;
        for(int i = n; i > 1; i--) {
            if(n % i == 0)
                factors++;
        }
        return factors == 2;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(checkPrime(num));
    }
}
