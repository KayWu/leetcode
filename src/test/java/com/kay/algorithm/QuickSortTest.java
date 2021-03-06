package com.kay.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class QuickSortTest {

    private QuickSort solution;

    @BeforeEach
    void setup() {
        solution = new QuickSort();
    }


    @Test
    void sample() {
        int[] a = {4, 5, 6, 3, 2, 1};
        solution.sort(a);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, a);
    }

    @Test
    void one() {
        int[] a = {1};
        solution.sort(a);
        assertArrayEquals(new int[]{1}, a);
    }

    @Test
    void reverse() {
        int[] a = {6, 5, 4, 3, 2, 1};
        solution.sort(a);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, a);
    }


    @Test
    void dup() {
        int[] a = {1, 1, 1};
        solution.sort(a);
        assertArrayEquals(new int[]{1, 1, 1}, a);
    }

    @Test
    void notUnique() {
        int[] a = {1, 2, 3, 3, 2, 1};
        solution.sort(a);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, a);
    }

}

