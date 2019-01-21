package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class PreorderTraversalSolution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> orderList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                orderList.add(node.val);
                stack.add(node.right);
                stack.add(node.left);
            }
        }
        return orderList;
    }

}
