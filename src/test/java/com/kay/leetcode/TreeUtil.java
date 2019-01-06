package com.kay.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

}
