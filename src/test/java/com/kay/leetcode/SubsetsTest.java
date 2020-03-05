package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class SubsetsTest {

    private Subsets solution;

    @BeforeEach
    void setUp() {
        solution = new Subsets();
    }

    @Test
    void sample() {
        assertThat(solution.subsets(new int[]{1, 2, 3}),
                containsInAnyOrder(
                        Arrays.asList(3),
                        Arrays.asList(1),
                        Arrays.asList(2),
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(1, 3),
                        Arrays.asList(2, 3),
                        Arrays.asList(1, 2),
                        Arrays.asList()
                ));
    }

    @Test
    void empty() {
        assertThat(solution.subsets(new int[]{}),
                containsInAnyOrder(
                        new ArrayList<Integer>()
                ));
    }

}
