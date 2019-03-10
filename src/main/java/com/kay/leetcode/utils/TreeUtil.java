package com.kay.leetcode.utils;

import com.kay.leetcode.TreeNode;

import java.util.*;

public class TreeUtil {


    /**
     * Build tree with level order
     *
     * @param nums: Level Order
     * @return
     */
    public static TreeNode buildTree(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) return null;
        TreeNode root = new TreeNode(nums.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (i < nums.size()) {
            TreeNode node = queue.poll();
            if (nums.get(i) != null) {
                node.left = new TreeNode(nums.get(i));
                queue.add(node.left);
            }

            if (i + 1 < nums.size() && nums.get(i + 1) != null) {
                node.right = new TreeNode(nums.get(i + 1));
                queue.add(node.right);
            }

            i = i + 2;
        }
        return root;
    }

    public static List<Integer> orderPresent(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        List<Integer> orderList = new ArrayList<>();
        if (root == null) {
            return orderList;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                orderList.add(null);
            } else {
                orderList.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }

        while (!orderList.isEmpty() && orderList.get(orderList.size() - 1) == null) {
            orderList.remove(orderList.size() - 1);
        }
        return orderList;
    }


}
