package com.kay.leetcode;

import com.kay.utils.TreeNode;
import com.kay.utils.TreeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LowestCommonAncestorTest {

    private LowestCommonAncestor solution;

    @BeforeEach
    void setUp() {
        solution = new LowestCommonAncestor();
    }

    @Test
    void sample() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        assertEquals(solution.lowestCommonAncestor(root, root.left, root.right).val, 3);
        assertEquals(solution.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4)).val, 5);
    }

    @Test
    void notRootDirectNode() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(37, -34, -48, null, -100, -101, 48, null, null, null, null, -54, null, -71, -22, null, null, null, 8));
        assertEquals(solution.lowestCommonAncestor(root, new TreeNode(-71), new TreeNode(48)).val, 48);
    }
}