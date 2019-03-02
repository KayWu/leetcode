package com.kay.leetcode;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            throw new IllegalArgumentException();
        }
        return findEitherNode(root, p, q);
    }

    private TreeNode findEitherNode(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        TreeNode leftFind = findEitherNode(root.left, p, q);
        TreeNode rightFind = findEitherNode(root.right, p, q);
        if (leftFind != null && rightFind != null) {
            return root;
        } else if (leftFind != null) {
            return leftFind;
        } else if (rightFind != null) {
            return rightFind;
        } else {
            return null;
        }
    }
}
