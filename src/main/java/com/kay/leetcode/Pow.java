package com.kay.leetcode;

public class Pow {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == -1) {
            x = myPow(x * x, n / 2) / x;
        } else if (n % 2 == 1) {
            x = myPow(x * x, n / 2) * x;
        } else {
            x = myPow(x * x, n / 2);
        }
        return x;
    }
}
