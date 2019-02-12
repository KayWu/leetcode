package com.kay.leetcode;

/**
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBitsSolution {
    public int[] countBits(int num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        int[] result = new int[num + 1];
        result[0] = 0;
        for (int i = 1; i <= num; i++) {
            result[i] = 1 + result[i & (i - 1)];
        }
        return result;
    }
}
