package com.kay.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class PostorderTraversalSolution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> traversalList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                traversalList.add(node.val);
                stack.add(node.left);
                stack.add(node.right);
            }
        }
        Collections.reverse(traversalList);
        return traversalList;
    }

}
