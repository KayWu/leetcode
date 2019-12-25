package com.kay.leetcode;

import com.kay.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class InorderTraversalRecursive {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversalList = new ArrayList<>();
        internalTraversal(root, traversalList);
        return traversalList;
    }

    private void internalTraversal(TreeNode root, List<Integer> traversalList) {
        if (root == null) {
            return;
        }
        internalTraversal(root.left, traversalList);
        traversalList.add(root.val);
        internalTraversal(root.right, traversalList);
    }


}
