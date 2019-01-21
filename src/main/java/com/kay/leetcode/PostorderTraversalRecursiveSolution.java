package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class PostorderTraversalRecursiveSolution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> traversalList = new ArrayList<>();
        internalTraversal(root, traversalList);
        return traversalList;
    }

    private void internalTraversal(TreeNode root, List<Integer> traversalList) {
        if (root == null) {
            return;
        }
        internalTraversal(root.left, traversalList);
        internalTraversal(root.right, traversalList);
        traversalList.add(root.val);
    }


}
