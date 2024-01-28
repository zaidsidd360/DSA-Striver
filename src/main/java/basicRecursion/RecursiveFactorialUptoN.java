package main.java.basicRecursion;

import java.util.ArrayList;
import java.util.List;

public class RecursiveFactorialUptoN {

    public static int findRecursiveFactorial(int n, int fac) {
        // Base condition
        if(n == 0) return fac;
        return findRecursiveFactorial(n - 1, fac * n);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int n = 7;
        for(int i = 1; i < n; i++) {
            int currFac = findRecursiveFactorial(i, 1);
            if(currFac > n) break;
            list.add(currFac);
        }
        System.out.println(list);
    }
}
