package com.kay.algorithm;

public class SelectionSort {

    public void sort(int[] a) {
        int n = a.length;
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n; i++) {
            int minOrder = i;
            for (int j = i + 1; j < n; j++) {
                if (a[minOrder] > a[j]) {
                    minOrder = j;
                }
            }
            int tmp = a[minOrder];
            a[minOrder] = a[i];
            a[i] = tmp;
        }
    }
}
