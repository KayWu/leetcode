package com.kay.leetcode;

import com.kay.utils.TreeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class BstFromPreorderRecursiveTest {

    private BstFromPreorderRecursive solution;

    @BeforeEach
    void setUp() {
        solution = new BstFromPreorderRecursive();
    }

    @Test
    void sample() {
        assertThat(TreeUtil.orderPresent(solution.bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12})),
                contains(8, 5, 10, 1, 7, null, 12));
    }

    @Test
    void complex() {
        assertThat(TreeUtil.orderPresent(solution.bstFromPreorder(new int[]{9, 5, 1, 7, 6, 8, 10, 12})),
                contains(9, 5, 10, 1, 7, null, 12, null, null, 6, 8));
    }
}