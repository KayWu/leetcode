package com.kay.algorithm;

public class MergeSort {

    public void sort(int[] a) {
        int[] backup = new int[a.length];
        sort(a, backup, 0, a.length - 1);
    }

    private void sort(int[] a, int[] backup, int l, int h) {
        if (l >= h) {
            return;
        }
        int m = l + (h - l) / 2;
        sort(a, backup, l, m);
        sort(a, backup, m + 1, h);
        merge(a, backup, l, m, h);
    }

    private void merge(int[] a, int[] backup, int l, int m, int h) {
        for (int i = l; i <= h; i++) {
            backup[i] = a[i];
        }
        int i = l;
        int j = m + 1;
        for (int k = l; k <= h; k++) {
            if (i <= m && j <= h) {
                if (backup[i] <= backup[j]) {
                    a[k] = backup[i];
                    i++;
                } else {
                    a[k] = backup[j];
                    j++;
                }
            } else if (i <= m) {
                a[k] = backup[i];
                i++;
            } else {
                a[k] = backup[j];
                j++;
            }
        }
    }

}
