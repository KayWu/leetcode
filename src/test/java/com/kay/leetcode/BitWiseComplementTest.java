package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitWiseComplementTest {

    private BitWiseComplement solution;

    @BeforeEach
    void setUp() {
        solution = new BitWiseComplement();
    }

    @Test
    void sample() {
        assertEquals(2, solution.bitwiseComplement(5));
        assertEquals(0, solution.bitwiseComplement(7));
        assertEquals(5, solution.bitwiseComplement(10));
    }

    @Test
    void specialCase() {
        assertEquals(1, solution.bitwiseComplement(2));
        assertEquals(1, solution.bitwiseComplement(0));
        assertEquals(0, solution.bitwiseComplement(1));
    }
}