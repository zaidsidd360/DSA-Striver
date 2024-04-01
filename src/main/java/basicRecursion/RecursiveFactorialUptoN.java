package main.java.basicRecursion;

import java.util.ArrayList;
import java.util.List;

public class RecursiveFactorialUptoN {

    // Parameterised resursive function
    public static int findRecursiveFactorial(int n, int fac) {
        // Base condition
        if(n <= 0) return fac;
        return findRecursiveFactorial(n - 1, fac * n);
    }
    
    // Functional recursive function
    public static int findRecursiveFactorial2(int n) {
        // Base condition
        if(n == 1) return 1;
        return n * findRecursiveFactorial2(n - 1);
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int n = 7;
        for(int i = 1; i < n; i++) {
            int currFac = findRecursiveFactorial2(i);
            if(currFac > n) break;
            list.add(currFac);
        }
        System.out.println(list);
    }

}
