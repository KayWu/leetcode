package com.kay.algorithm;

public class QuickSort {

    public void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private void sort(int[] a, int l, int h) {
        if (l >= h) {
            return;
        }
        int i = partition(a, l, h);
        sort(a, l, i - 1);
        sort(a, i + 1, h);
    }

    private int partition(int[] a, int l, int h) {
        int v = a[l];

        int i = l + 1;
        int j = h;

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
            i++;
            j--;
        }
        exch(a, l, j);
        return j;
    }

    private void exch(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}
