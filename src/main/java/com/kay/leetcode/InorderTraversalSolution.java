package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class InorderTraversalSolution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversalList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.add(current);
                current = current.left;
            } else {
                TreeNode node = stack.pop();
                traversalList.add(node.val);
                current = node.right;
            }
        }
        return traversalList;
    }


}
