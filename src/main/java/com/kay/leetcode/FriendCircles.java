package com.kay.leetcode;

public class FriendCircles {

    public int findCircleNum(int[][] M) {
        int N = M.length;
        UnionFind unionFind = new UnionFind(N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i > j && M[i][j] == 1) {
                    unionFind.union(i, j);
                }
            }
        }
        return unionFind.count;
    }

    public static class UnionFind {
        private int[] roots;
        private int count;

        public UnionFind(int N) {
            roots = new int[N];
            count = N;
            for (int i = 0; i < N; i++) {
                roots[i] = i;
            }
        }

        private int findRoot(int i) {
            while (roots[i] != i) {
                // 路径压缩
                roots[i] = roots[roots[i]];
                i = roots[i];
            }
            return i;
        }

        public boolean isConnected(int p, int q) {
            return findRoot(p) == findRoot(q);
        }

        public void union(int p, int q) {
            int qRoot = findRoot(p);
            int pRoot = findRoot(q);
            if (qRoot == pRoot) {
                return;
            }
            count--;
            roots[pRoot] = qRoot;
        }
    }

}
