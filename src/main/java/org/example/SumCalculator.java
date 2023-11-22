package org.example;

public class SumCalculator {

    public int sum(int n){
        if (n == 0) {
            throw new IllegalArgumentException();
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
