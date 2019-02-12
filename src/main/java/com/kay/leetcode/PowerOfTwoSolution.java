package com.kay.leetcode;

/**
 * https://leetcode.com/problems/power-of-two/
 */
public class PowerOfTwoSolution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
