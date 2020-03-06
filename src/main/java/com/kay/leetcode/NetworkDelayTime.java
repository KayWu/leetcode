package com.kay.leetcode;

import java.util.*;

public class NetworkDelayTime {

    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < times.length; i++) {
            List<int[]> list = map.computeIfAbsent(times[i][0], k -> new ArrayList<>());
            list.add(times[i]);
        }
        PriorityQueue<int[]> qp = new PriorityQueue<>((a, b) -> {
            return a[0] - b[0];
        });
        qp.add(new int[]{0, K});
        boolean[] visited = new boolean[N + 1];
        int ans = 0;
        int count = 0;

        while (!qp.isEmpty()) {
            int[] cur = qp.poll();
            int curNode = cur[1];
            int curDist = cur[0];
            if (visited[curNode]) {
                continue;
            }
            count++;
            visited[curNode] = true;
            ans = curDist;
            if (map.containsKey(curNode)) {
                for (int[] time : map.get(curNode)) {
                    qp.add(new int[]{curDist + time[2], time[1]});
                }
            }
        }
        return count == N ? ans : -1;
    }
}
