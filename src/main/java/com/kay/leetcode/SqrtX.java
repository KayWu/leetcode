package com.kay.leetcode;

/**
 * https://leetcode.com/problems/sqrtx/
 */
public class SqrtX {
    public int mySqrt(int x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        }
        if (x == 0) {
            return 0;
        }
        double r = x;
        while (Math.abs(r * r - x) > 1e-2) {
            // 牛顿迭代法 https://zh.wikipedia.org/wiki/%E7%89%9B%E9%A1%BF%E6%B3%95
            r = 0.5 * (r + x / r);
        }
        return (int) r;
    }
}
