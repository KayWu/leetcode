package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class SubsetsWithDupTest {

    private SubsetsWithDup solution;

    @BeforeEach
    void setUp() {
        solution = new SubsetsWithDup();
    }

    @Test
    void sample() {
        assertThat(solution.subsetsWithDup(new int[]{1, 2, 2}),
                containsInAnyOrder(
                        Arrays.asList(1),
                        Arrays.asList(2),
                        Arrays.asList(1, 2, 2),
                        Arrays.asList(1, 2),
                        Arrays.asList(2, 2),
                        Arrays.asList()
                ));
    }

    @Test
    void empty() {
        assertThat(solution.subsetsWithDup(new int[]{}),
                containsInAnyOrder(
                        new ArrayList<Integer>()
                ));
    }

}
