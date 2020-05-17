package com.kay.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class KthLargestOfArrayTest {

    private KthLargestOfArray solution;

    @BeforeEach
    void setUp() {
        solution = new KthLargestOfArray();
    }

    @Test
    void sample() {
        assertEquals(5, solution.findKthLargest(new int[] { 3, 2, 1, 5, 6, 4 }, 2));
        assertEquals(4, solution.findKthLargest(new int[] { 3, 2, 3, 1, 2, 4, 5, 5, 6 }, 4));
    }
}
