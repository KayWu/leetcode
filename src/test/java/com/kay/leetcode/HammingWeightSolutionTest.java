package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HammingWeightSolutionTest {

    private HammingWeightSolution solution;

    @BeforeEach
    void setUp() {
        solution = new HammingWeightSolution();
    }

    @Test
    void sample() {
        assertEquals(3, solution.hammingWeight(0b1011));
        assertEquals(1, solution.hammingWeight(0b10000000));
        assertEquals(31, solution.hammingWeight(0b11111111111111111111111111111101));
    }
}