package com.kay.algorithm;

public class InsertionSort {

    public void sort(int[] a) {
        int n = a.length;
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            int value = a[i + 1];
            int j = i;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }
}
