package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class PreorderTraversalRecursiveSolutionTest {

    private PreorderTraversalRecursiveSolution solution;

    @BeforeEach
    void setUp() {
        solution = new PreorderTraversalRecursiveSolution();
    }

    @Test
    void sample() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(1, null, 2, 3));
        assertThat(solution.preorderTraversal(root), contains(1, 2, 3));
    }

    @Test
    void complex() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        assertThat(solution.preorderTraversal(root), contains(3, 5, 6, 2, 7, 4, 1, 0, 8));
    }
}