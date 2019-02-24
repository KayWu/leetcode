package com.kay.leetcode;

/**
 * https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/
 */
public class MinKBitFlipsSolution {
    public int minKBitFlips(int[] A, int K) {
        int N = A.length;
        int[] hint = new int[N];
        int ans = 0, flipTarget = 0;

        for (int i = 0; i < N; i++) {
            // flip: 0 isFlipped[i]: 0 if A[i] is 0 then need flip
            // flip: 0 isFlipped[i]: 1 if A[i] is 1 then need flip
            // flip: 1 isFlipped[i]: 0 if A[i] is 1 then need flip
            // flip: 1 isFlipped[i]: 1 if A[i] is 0 then need flip
            flipTarget ^= hint[i];
            if (A[i] == flipTarget) {
                ans++;
                if (i + K > N) {
                    return -1;
                }
                // new flip target
                flipTarget ^= 1;
                if (i + K < N) {
                    hint[i + K] ^= 1;
                }
            }
        }
        return ans;
    }
}
