package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class PreorderTraversalRecursive {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversalList = new ArrayList<>();
        internalTraversal(root, traversalList);
        return traversalList;
    }

    private void internalTraversal(TreeNode root, List<Integer> traversalList) {
        if (root == null) {
            return;
        }
        traversalList.add(root.val);
        internalTraversal(root.left, traversalList);
        internalTraversal(root.right, traversalList);
    }


}
