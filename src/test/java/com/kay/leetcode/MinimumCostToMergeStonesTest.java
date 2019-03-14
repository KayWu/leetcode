package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumCostToMergeStonesTest {

    private MinimumCostToMergeStones solution;

    @BeforeEach
    void setUp() {
        solution = new MinimumCostToMergeStones();
    }

    @Test
    void sample() {
        assertEquals(20, solution.mergeStones(new int[]{3, 2, 4, 1}, 2));
        assertEquals(-1, solution.mergeStones(new int[]{3, 2, 4, 1}, 3));
        assertEquals(25, solution.mergeStones(new int[]{3, 5, 1, 2, 6}, 3));
    }

}