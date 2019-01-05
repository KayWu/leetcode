package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TwoSumSolutionTest {

    private TwoSumSolution solution;

    @BeforeEach
    void setUp() {
        solution = new TwoSumSolution();
    }


    @Test
    void nullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.twoSum(null, 0);
        });
    }

    @Test
    void emptyArray() {
        assertNull(solution.twoSum(new int[]{}, 0));
    }

    @Test
    void normalCase() {
        assertThat(solution.twoSum(new int[]{2, 7, 11, 15}, 9), equalTo(new int[]{0, 1}));
        assertThat(solution.twoSum(new int[]{2, 7, 11, 15}, 17), equalTo(new int[]{0, 3}));
        assertThat(solution.twoSum(new int[]{2, 7, 11, 15}, 18), equalTo(new int[]{1, 2}));
        assertThat(solution.twoSum(new int[]{2, 7, 11, 15}, 22), equalTo(new int[]{1, 3}));
    }

    @Test
    void sameValueTwice() {
        assertThat(solution.twoSum(new int[]{2, 2, 1, 5}, 4), equalTo(new int[]{0, 1}));
    }

}