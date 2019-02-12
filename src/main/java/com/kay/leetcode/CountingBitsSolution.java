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
        int lastPowerOfTwo = 1;
        for (int i = 1; i <= num; i++) {
            if ((i & (i - 1)) == 0) {
                lastPowerOfTwo = i;
                result[i] = 1;
            } else {
                result[i] = 1 + result[i - lastPowerOfTwo];
            }
        }
        return result;
    }
}
