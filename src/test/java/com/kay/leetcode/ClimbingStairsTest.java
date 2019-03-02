package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    private ClimbingStairs solution;

    @BeforeEach
    void setUp() {
        solution = new ClimbingStairs();
    }

    @Test
    void sample() {
        assertEquals(2, solution.climbStairs(2));
        assertEquals(3, solution.climbStairs(3));
    }


    @Test
    void one() {
        assertEquals(1, solution.climbStairs(1));
    }


    @Test
    void bitN() {
        assertEquals(34, solution.climbStairs(8));
    }
}