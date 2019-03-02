package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArrayTest {

    private MedianOfTwoSortedArray solution;

    @BeforeEach
    void setUp() {
        solution = new MedianOfTwoSortedArray();
    }

    @Test
    void sample() {
        assertEquals(2.0, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 1e-5);
        assertEquals(2.5, solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 1e-5);
    }
}