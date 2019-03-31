package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaseNeg2Test {

    private BaseNeg2 solution;

    @BeforeEach
    void setUp() {
        solution = new BaseNeg2();
    }

    @Test
    void sample() {
        assertEquals("110", solution.baseNeg2(2));
        assertEquals("111", solution.baseNeg2(3));
        assertEquals("100", solution.baseNeg2(4));
    }

    @Test
    void zero() {
        assertEquals("0", solution.baseNeg2(0));
    }

}