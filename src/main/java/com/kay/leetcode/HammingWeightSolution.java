package com.kay.leetcode;

/**
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class HammingWeightSolution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int weight = 0;
        while (n != 0) {
            n = n & (n - 1);
            weight++;
        }
        return weight;
    }

    public int hammingWeight2(int n) {
        int weight = 0;
        while (n != 0) {
            // 要考虑负数的情况
            if (n % 2 != 0) {
                weight++;
            }
            // 使用无符号右移
            n = n >>> 1;
        }
        return weight;
    }
}
