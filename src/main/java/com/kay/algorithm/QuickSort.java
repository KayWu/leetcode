package com.kay.algorithm;

public class QuickSort {

    public void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private void sort(int[] a, int l, int h) {
        if (l >= h) {
            return;
        }
        int p = partition(a, l, h);
        sort(a, l, p - 1);
        sort(a, p + 1, h);
    }

    private int partition(int[] a, int l, int h) {
        int pivot = a[h];
        int i = l;
        for (int j = l; j < h; j++) {
            if (a[j] < pivot) {
                exch(a, i, j);
                i++;
            }
        }
        exch(a, i, h);
        return i;
    }

    private void exch(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }


}
