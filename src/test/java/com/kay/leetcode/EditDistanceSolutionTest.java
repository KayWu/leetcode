package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EditDistanceSolutionTest {

    private EditDistanceSolution solution;

    @BeforeEach
    void setUp() {
        solution = new EditDistanceSolution();
    }

    @Test
    void sample() {
        assertEquals(3, solution.minDistance("horse", "ros"));
        assertEquals(5, solution.minDistance("intention", "execution"));
    }


    @Test
    void emptyString() {
        assertEquals(5, solution.minDistance("", "apple"));
        assertEquals(5, solution.minDistance("apple", ""));
        assertEquals(0, solution.minDistance("", ""));
    }
}