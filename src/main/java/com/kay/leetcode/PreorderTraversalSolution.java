package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class PreorderTraversalSolution {

    /**
     * recursive solution
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> orderList = new ArrayList<>();
        internalTraversal(root, orderList);
        return orderList;
    }

    private void internalTraversal(TreeNode root, List<Integer> orderList) {
        if (root == null) {
            return;
        }
        orderList.add(root.val);
        internalTraversal(root.left, orderList);
        internalTraversal(root.right, orderList);
    }


}
