package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleSolutionTest {

    private TriangleSolution solution;

    @BeforeEach
    void setUp() {
        solution = new TriangleSolution();
    }

    @Test
    void sample() {
        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );

        assertEquals(11, solution.minimumTotal(triangle));
    }
}