package com.kay.leetcode;

import com.kay.utils.TreeNode;
import com.kay.utils.TreeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LowestCommonAncestorBSTTest {

    private LowestCommonAncestorBST solution;

    @BeforeEach
    void setUp() {
        solution = new LowestCommonAncestorBST();
    }


    @Test
    void sample() {
        TreeNode root = TreeUtil.buildTree(Arrays.asList(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5));
        assertEquals(solution.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)).val, 6);
        assertEquals(solution.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)).val, 2);
        assertEquals(solution.lowestCommonAncestor(root, new TreeNode(7), new TreeNode(9)).val, 8);
        assertEquals(solution.lowestCommonAncestor(root, new TreeNode(3), new TreeNode(5)).val, 4);
        assertEquals(solution.lowestCommonAncestor(root, new TreeNode(4), new TreeNode(3)).val, 4);
    }


}