package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThreeSumSolutionTest {
    private ThreeSumSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ThreeSumSolution();
    }

    @Test
    void nullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.threeSum(null);
        });
    }

    @Test
    void arraySizeLessThanThree() {
        assertTrue(solution.threeSum(new int[]{}).isEmpty());
    }

    @Test
    void singleResult() {
        assertThat(solution.threeSum(new int[]{-1, -2, 3, 4}), containsInAnyOrder(Arrays.asList(-2, -1, 3)));
    }

    @Test
    void sample() {
        assertThat(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}),
                containsInAnyOrder(Arrays.asList(-1, 0, 1), Arrays.asList(-1, -1, 2)));
    }

    @Test
    void noDupResult() {
        assertThat(solution.threeSum(new int[]{-1, -1, -1, 0, 1, 1, 1}),
                containsInAnyOrder(Arrays.asList(-1, 0, 1)));
    }

    @Test
    void multiMatch() {
        assertThat(solution.threeSum(new int[]{-1, -1, -1, 0, 0, 0, 1, 1, 1}),
                containsInAnyOrder(Arrays.asList(-1, 0, 1), Arrays.asList(0, 0, 0)));
    }

    @Test
    void exactMatch() {
        assertThat(solution.threeSum(new int[]{-2, 1, 1}),
                containsInAnyOrder(Arrays.asList(-2, 1, 1)));
    }


}