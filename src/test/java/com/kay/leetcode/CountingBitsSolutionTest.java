package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CountingBitsSolutionTest {

    private CountingBitsSolution solution;

    @BeforeEach
    void setUp() {
        solution = new CountingBitsSolution();
    }

    @Test
    void sample() {
        assertThat(solution.countBits(2), equalTo(new int[]{0, 1, 1}));
        assertThat(solution.countBits(5), equalTo(new int[]{0, 1, 1, 2, 1, 2}));
    }

    @Test
    void zero() {
        assertThat(solution.countBits(0), equalTo(new int[]{0}));
    }


    @Test
    void one() {
        assertThat(solution.countBits(1), equalTo(new int[]{0, 1}));
    }

    @Test
    void bitNumber() {
        assertThat(solution.countBits(15), equalTo(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4}));
    }

    @Test
    void illegal() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.countBits(-1);
        });
    }
}