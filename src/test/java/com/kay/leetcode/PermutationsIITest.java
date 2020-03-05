package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationsIITest {

    private PermutationsII solution;

    @BeforeEach
    public void setUp() {
        solution = new PermutationsII();
    }

    @Test
    void sample() {
        assertThat(solution.permuteUnique(new int[]{1, 1, 2}),
                containsInAnyOrder(
                        Arrays.asList(1, 1, 2),
                        Arrays.asList(1, 2, 1),
                        Arrays.asList(2, 1, 1)
                ));
    }

    @Test
    void dup() {
        assertThat(solution.permuteUnique(new int[]{2, 2}),
                containsInAnyOrder(
                        Arrays.asList(2, 2)
                ));
    }


    @Test
    void empty() {
        assertTrue(solution.permuteUnique(new int[]{}).isEmpty());
    }
}
