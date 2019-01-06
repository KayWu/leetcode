package com.kay.leetcode;

public class ValidBSTSolution {

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return isValidBST(root.left, null, root.val) && isValidBST(root.right, root.val, null);
    }

    private boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if (min != null && root.val <= min) return false;
        if (max != null && root.val >= max) return false;

        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}
