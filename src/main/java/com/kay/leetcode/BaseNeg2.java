package com.kay.leetcode;

/**
 * https://leetcode.com/problems/convert-to-base-2/
 *  1 / (-2) = 0... 1 same -(1>>1) = 0
 * -1 / (-2) = 0...-1 diff -(-1>>1) = 1
 * 需要余数为正数
 */
public class BaseNeg2 {

    public String baseNeg2(int N) {
        StringBuilder ans = new StringBuilder();
        while (N != 0) {
            ans.insert(0, (N & 1));
            N = -(N >> 1);
        }
        return ans.toString().equals("") ? "0" : ans.toString();
    }
}
