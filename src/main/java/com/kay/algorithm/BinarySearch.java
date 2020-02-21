package com.kay.algorithm;

public class BinarySearch {

    public int search(int[] a, int key) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] > key) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }


}
