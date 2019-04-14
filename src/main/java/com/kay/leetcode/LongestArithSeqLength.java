package com.kay.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/longest-arithmetic-sequence/
 */
public class LongestArithSeqLength {

    /**
     * 使用 DP
     * @param A
     * @return
     */
    public int longestArithSeqLength(int[] A) {
        int ans = 2;
        Map<Integer, Map<Integer, Integer>> dp = new HashMap<>();
        for (int i = 0; i < A.length; ++i) {
            for (int j = i + 1; j < A.length; ++j) {
                int a = A[i];
                int b = A[j];
                Map<Integer, Integer> diffMap = dp.computeIfAbsent(b - a, k -> new HashMap<>());
                int currMax = Math.max(diffMap.getOrDefault(j, 0), diffMap.getOrDefault(i, 0) + 1);
                diffMap.put(j, currMax);
                ans = Math.max(ans, currMax + 1);
            }
        }
        return ans;
    }

    /**
     * 原解法，速度较快
     * @param A
     * @return
     */
    public int longestArithSeqLengthII(int[] A) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < A.length; ++i) {
            List<Integer> list = map.getOrDefault(A[i], new ArrayList<>());
            list.add(i);
            map.put(A[i], list);
        }

        int ans = 0;
        for (int i = 0; i < A.length; ++i) {
            int start = A[i];
            for (int j = i + 1; j < A.length; ++j) {
                int next = A[j];
                int interval = start - next;
                if (interval == 0) {
                    ans = Math.max(ans, map.get(start).size());
                } else {
                    int size = 2;
                    int last = j;
                    while (true) {
                        next = next - interval;
                        List<Integer> list = map.get(next);
                        if (list == null) {
                            ans = Math.max(ans, size);
                            break;
                        } else {
                            int insertPoint = -Collections.binarySearch(list, last) - 1;
                            if (insertPoint >= list.size()) {
                                break;
                            }
                            last = list.get(insertPoint);
                            size++;
                            ans = Math.max(ans, size);
                        }
                    }
                }
            }
        }
        return ans;
    }

}
