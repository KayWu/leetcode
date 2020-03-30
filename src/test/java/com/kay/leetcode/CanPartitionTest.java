package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanPartitionTest {

    private CanPartition solution;

    @BeforeEach
    void setUp() {
        solution = new CanPartition();
    }

    @Test
    void sample() {
        assertTrue(solution.canPartition(new int[]{1, 5, 11, 5}));
        assertFalse(solution.canPartition(new int[]{1, 2, 3, 5}));
    }

    @Test
    void failCase() {
        assertFalse(solution.canPartition(new int[]{1, 2, 5}));
    }


}
