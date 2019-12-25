package com.kay.leetcode;

import com.kay.utils.TreeNode;
import com.kay.utils.TreeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InorderTraversalTest {

    private InorderTraversal solution;

    @BeforeEach
    void setUp() {
        solution = new InorderTraversal();
    }

    @Test
    void empty() {
        assertTrue(solution.inorderTraversal(null).isEmpty());
    }

    @Test
    void sample() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(1, null, 2, 3));
        assertThat(solution.inorderTraversal(root), contains(1, 3, 2));
    }

    @Test
    void complex() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        assertThat(solution.inorderTraversal(root), contains(6, 5, 7, 2, 4, 3, 0, 1, 8));
    }


}