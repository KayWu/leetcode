package com.kay.leetcode;

public class PowSolution {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            double temp = myPow(x, n / 2);
            return temp * temp;
        } else if (n > 0) {
            double temp = myPow(x, (n - 1) / 2);
            return temp * temp * x;
        } else {
            double temp = myPow(x, (n + 1) / 2);
            return temp * temp / x;
        }
    }
}
