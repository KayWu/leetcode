package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

class LowestCommonAncestorSolutionTest {

    private LowestCommonAncestorSolution solution;

    @BeforeEach
    void setUp() {
        solution = new LowestCommonAncestorSolution();
    }

    @Test
    void sample() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        assertThat(3, equalTo(solution.lowestCommonAncestor(root, root.left, root.right).val));
        assertThat(5, equalTo(solution.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4)).val));
    }

    @Test
    void notRootDirectNode() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(37, -34, -48, null, -100, -101, 48, null, null, null, null, -54, null, -71, -22, null, null, null, 8));
        assertThat(48, equalTo(solution.lowestCommonAncestor(root, new TreeNode(-71), new TreeNode(48)).val));
    }
}