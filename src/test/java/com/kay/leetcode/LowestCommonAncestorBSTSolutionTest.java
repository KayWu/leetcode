package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

class LowestCommonAncestorBSTSolutionTest {

    private LowestCommonAncestorBSTSolution solution;

    @BeforeEach
    void setUp() {
        solution = new LowestCommonAncestorBSTSolution();
    }


    @Test
    void sample() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5));
        assertThat(6, equalTo(solution.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)).val));
        assertThat(2, equalTo(solution.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)).val));
        assertThat(8, equalTo(solution.lowestCommonAncestor(root, new TreeNode(7), new TreeNode(9)).val));
        assertThat(4, equalTo(solution.lowestCommonAncestor(root, new TreeNode(3), new TreeNode(5)).val));
        assertThat(4, equalTo(solution.lowestCommonAncestor(root, new TreeNode(4), new TreeNode(3)).val));
    }


}