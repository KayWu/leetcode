package com.kay.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/course-schedule/
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] p) {
        int[] inDegree = new int[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < p.length; i++) {
            inDegree[p[i][0]]++;
            List<Integer> tos = map.computeIfAbsent(p[i][1], k -> new ArrayList<>());
            tos.add(p[i][0]);
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int c = q.poll();
            if (map.get(c) != null) {
                List<Integer> tos = map.get(c);
                for (int to: tos) {
                    inDegree[to]--;
                    if (inDegree[to] == 0) {
                        q.add(to);
                    }
                }
            }
        }
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
