package com.kay.leetcode;

public class LowestCommonAncestorBSTSolution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int max = Math.max(p.val, q.val);
        int min = Math.min(p.val, q.val);
        if (root.val <= max && root.val >= min) {
            return root;
        } else if (root.val > max) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }
}
