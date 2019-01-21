package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class InorderTraversalRecursiveSolution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> orderList = new ArrayList<>();
        internalTraversal(root, orderList);
        return orderList;
    }

    private void internalTraversal(TreeNode root, List<Integer> orderList) {
        if (root == null) {
            return;
        }
        internalTraversal(root.left, orderList);
        orderList.add(root.val);
        internalTraversal(root.right, orderList);
    }


}
