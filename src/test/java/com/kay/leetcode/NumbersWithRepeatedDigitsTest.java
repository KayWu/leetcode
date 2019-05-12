package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersWithRepeatedDigitsTest {

    private NumbersWithRepeatedDigits solution;

    @BeforeEach
    void setUp() {
        solution = new NumbersWithRepeatedDigits();
    }

    @Test
    void sample() {
        assertEquals(1, solution.numDupDigitsAtMostN(20));
        assertEquals(12, solution.numDupDigitsAtMostN(110));
        assertEquals(262, solution.numDupDigitsAtMostN(1000));
    }

    @Test
    void cornerCase() {
        assertEquals(0, solution.numDupDigitsAtMostN(1));
        assertEquals(0, solution.numDupDigitsAtMostN(10));
        assertEquals(1, solution.numDupDigitsAtMostN(11));
        assertEquals(12, solution.numDupDigitsAtMostN(110));
    }
}