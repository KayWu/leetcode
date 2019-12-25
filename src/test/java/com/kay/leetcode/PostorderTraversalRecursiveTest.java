package com.kay.leetcode;

import com.kay.utils.TreeNode;
import com.kay.utils.TreeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PostorderTraversalRecursiveTest {

    private PostorderTraversalRecursive solution;

    @BeforeEach
    void setUp() {
        solution = new PostorderTraversalRecursive();
    }

    @Test
    void empty() {
        assertTrue(solution.postorderTraversal(null).isEmpty());
    }

    @Test
    void sample() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(1, null, 2, 3));
        assertThat(solution.postorderTraversal(root), contains(3, 2, 1));
    }

    @Test
    void complex() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        assertThat(solution.postorderTraversal(root), contains(6, 7, 4, 2, 5, 0, 8, 1, 3));
    }


}