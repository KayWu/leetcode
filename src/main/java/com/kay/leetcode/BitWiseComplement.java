package com.kay.leetcode;

/**
 * https://leetcode.com/problems/complement-of-base-10-integer/
 */
public class BitWiseComplement {
    public int bitwiseComplement(int N) {
        int mark = 1;
        while (N > mark) {
            mark = (mark << 1) + 1;
        }
        return N ^ mark;
    }
}
