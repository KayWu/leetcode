package com.kay.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 */
public class BstFromPreorder {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode prev = root;
        for (int i = 1; i < preorder.length; i++) {
            TreeNode node = new TreeNode(preorder[i]);
            if (stack.peek().val > node.val) {
                prev.left = node;
            } else {
                while (!stack.isEmpty() && stack.peek().val < node.val) {
                    prev = stack.pop();
                }
                prev.right = node;
            }
            stack.push(node);
            prev = node;
        }
        return root;
    }
}
