package com.kay.leetcode;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class SearchRotatedSortedArray {

    public int search(int[] a, int target) {
        int l = 0;
        int h = a.length - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;

            if (a[m] == target) {
                return m;
            }
            if (a[m] >= a[0]) {
                if (target >= a[0]) {
                    if (a[m] > target) {
                        h = m - 1;
                    } else {
                        l = m + 1;
                    }
                } else {
                    l = m + 1;
                }
            } else {
                if (target >= a[0]) {
                    h = m - 1;
                } else {
                    if (a[m] > target) {
                        h = m - 1;
                    } else {
                        l = m + 1;
                    }
                }
            }
        }
        return -1;
    }
}
