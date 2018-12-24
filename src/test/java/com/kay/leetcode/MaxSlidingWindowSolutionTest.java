package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MaxSlidingWindowSolutionTest {

    private MaxSlidingWindowSolution solution;

    @BeforeEach
    void setUp() {
        solution = new MaxSlidingWindowSolution();
    }

    @Test
    void testDisorderArray() {
        int[] maxSlidingWindow = solution.maxSlidingWindow(new int[]{3, 1, 2, 5, 4, 1, 3, 8}, 3);
        assertThat(maxSlidingWindow, equalTo(new int[]{3, 5, 5, 5, 4, 8}));
    }

    @Test
    void testDisorderArray2() {
        int[] maxSlidingWindow = solution.maxSlidingWindow(new int[]{1, 3, 1, 2, 0, 5}, 3);
        assertThat(maxSlidingWindow, equalTo(new int[]{3, 3, 2, 5}));
    }

    @Test
    void testAscendingArray() {
        int[] maxSlidingWindow = solution.maxSlidingWindow(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
        assertThat(maxSlidingWindow, equalTo(new int[]{2, 3, 4, 5, 6, 7}));
    }

    @Test
    void testDecreasingArray() {
        int[] maxSlidingWindow = solution.maxSlidingWindow(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, 4);
        assertThat(maxSlidingWindow, equalTo(new int[]{8, 7, 6, 5, 4}));
    }

    @Test
    void testNull() {
        assertThrows(IllegalArgumentException.class, () -> solution.maxSlidingWindow(null, 4));
    }

    @Test
    void testEmptyArray() {
        int[] maxSlidingWindow = solution.maxSlidingWindow(new int[]{}, 0);
        assertThat(maxSlidingWindow, equalTo(new int[]{}));
    }

    @Test
    void testArraySizeLessThanK() {
        assertThrows(IllegalArgumentException.class, () -> solution.maxSlidingWindow(new int[]{1, 2, 3}, 4));
    }

    @Test
    void testIllegalK() {
        assertThrows(IllegalArgumentException.class, () -> solution.maxSlidingWindow(new int[]{1, 2, 3}, -1));
    }

    @Test
    void testArraySizeEqualK() {
        int[] maxSlidingWindow = solution.maxSlidingWindow(new int[]{1, 2, 4, 3}, 4);
        assertThat(maxSlidingWindow, equalTo(new int[]{4}));
    }
}