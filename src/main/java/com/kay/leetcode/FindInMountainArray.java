package com.kay.leetcode;

import com.kay.leetcode.utils.MountainArray;

/**
 * https://leetcode.com/problems/find-in-mountain-array/
 */
public class FindInMountainArray {

    public int findInMountainArray(int target, MountainArray A) {
        int n = A.length();
        int peak = 0;
        int m;
        int l = 0;
        int r = n - 1;
        // Find the peak
        while (l < r) {
            m = (l + r) / 2;
            if (A.get(m) < A.get(m + 1)) {
                l = peak = m + 1;
            } else {
                r = m;
            }
        }

        // Find target in the left
        l = 0;
        r = peak;
        while (l <= r) {
            m = (l + r) / 2;
            int find = A.get(m);
            if (find > target) {
                r = m - 1;
            } else if (find < target) {
                l = m + 1;
            } else {
                return m;
            }
        }

        // Find target in the right
        l = peak;
        r = n - 1;
        while (l <= r) {
            m = (l + r) / 2;
            int find = A.get(m);
            if (find > target) {
                l = m - 1;
            } else if (find < target) {
                r = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }


}
