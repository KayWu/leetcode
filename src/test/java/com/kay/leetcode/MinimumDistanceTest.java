package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDistanceTest {

    private MinimumDistance solution;

    @BeforeEach
    void setUp() {
        solution = new MinimumDistance();
    }

    @Test
    void sample() {
        assertEquals(3, solution.minimumDistance("CAKE"));
        assertEquals(6, solution.minimumDistance("HAPPY"));
        assertEquals(3, solution.minimumDistance("NEW"));
        assertEquals(7, solution.minimumDistance("YEAR"));
    }

    @Test
    void emptyString() {
        assertEquals(0, solution.minimumDistance(""));
    }

    @Test
    void oneChar() {
        assertEquals(0, solution.minimumDistance("A"));
    }
}
