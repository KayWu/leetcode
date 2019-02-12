package com.kay.leetcode;

import java.util.List;

/**
 * https://leetcode.com/problems/triangle/
 */
public class TriangleSolution {

    // 由于不像二叉树，子节点只有一个父节点，所以会导致递归有重复计算的部分
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] arr = new int[triangle.get(triangle.size() - 1).size()];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            if (i == triangle.size() - 1) {
                for (int j = 0; j < row.size(); j++) {
                    arr[j] = row.get(j);
                }
            } else {
                for (int j = 0; j < row.size(); j++) {
                    // arr[j] 之后不会被用到，所以直接可以替换
                    arr[j] = Math.min(arr[j], arr[j + 1]) + row.get(j);
                }
            }
        }
        return arr[0];
    }
}
