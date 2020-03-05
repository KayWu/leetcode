package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationsTest {

    private Permutations solution;

    @BeforeEach
    public void setUp() {
        solution = new Permutations();
    }

    @Test
    void sample() {
        assertThat(solution.permute(new int[]{1, 2, 3}),
                containsInAnyOrder(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(1, 3, 2),
                        Arrays.asList(2, 1, 3),
                        Arrays.asList(2, 3, 1),
                        Arrays.asList(3, 1, 2),
                        Arrays.asList(3, 2, 1)
                ));
    }

    @Test
    void empty() {
        assertTrue(solution.permute(new int[]{}).isEmpty());
    }
}
