package com.kay.leetcode;

public class PowSolution {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            double result = myPow(x, n / 2);
            return result * result;
        } else if (n > 0) {
            double result = myPow(x, (n - 1) / 2);
            return result * result * x;
        } else {
            double result = myPow(x, (n + 1) / 2);
            return result * result / x;
        }
    }
}
