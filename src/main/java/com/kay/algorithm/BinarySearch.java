package com.kay.algorithm;

public class BinarySearch {

    public int search(int[] a, int key) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (a[m] > key) {
                h = m - 1;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 查找第一个值等于给定值的元素
     *
     * @param a
     * @param key
     * @return
     */
    public int searchFirst(int[] a, int key) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (a[m] > key) {
                h = m - 1;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                if (m == 0 || a[m - 1] != key) {
                    return m;
                } else {
                    h = m - 1;
                }
            }
        }
        return -1;
    }

    public int searchFirstBiggerEqualThan(int[] a, int key) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (a[m] >= key) {
                if (m == 0 || a[m - 1] < key) {
                    return m;
                }
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;

    }


}
