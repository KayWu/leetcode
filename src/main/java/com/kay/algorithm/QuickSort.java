package com.kay.algorithm;

public class QuickSort {

    public void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private void sort(int[] a, int l, int h) {
        if (l >= h) {
            return;
        }
        int j = partition(a, l, h);
        sort(a, l, j - 1);
        sort(a, j + 1, h);
    }

    private int partition(int[] a, int l, int h) {
        int i = l + 1;
        int j = h;
        int v = a[l];
        while (true) {
            while (i < h && a[i] <= v) {
                i++;
            }
            while (j > l && a[j] >= v) {
                j--;
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, l, j);
        return j;
    }

    private void exch(int[] a, int i, int j) {
        int tmp = a[j];
        a[j] = a[i];
        a[i] = tmp;
    }
}
