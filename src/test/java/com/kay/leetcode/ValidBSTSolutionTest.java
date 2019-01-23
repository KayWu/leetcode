package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidBSTSolutionTest {

    private ValidBSTSolution solution;

    @BeforeEach
    void setUp() {
        solution = new ValidBSTSolution();
    }

    @Test
    void nullTree() {
        assertTrue(solution.isValidBST(null));
    }

    @Test
    void treeWithOneNode() {
        assertTrue(solution.isValidBST(new TreeNode(1)));
    }

    @Test
    void sample() {
        assertFalse(solution.isValidBST(TreeUtil.buildTree(Arrays.asList(5, 1, 4, null, null, 3, 6))));
    }

    @Test
    void simpleTree() {
        assertTrue(solution.isValidBST(TreeUtil.buildTree(Arrays.asList(2, 1, 3))));
        assertFalse(solution.isValidBST(TreeUtil.buildTree(Arrays.asList(2, 3, 1))));
    }

    @Test
    void complexTree() {
        assertTrue(solution.isValidBST(TreeUtil.buildTree(Arrays.asList(5, 1, 7, null, null, 6, 8))));
    }

}