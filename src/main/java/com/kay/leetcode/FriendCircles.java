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
            int root = i;
            while (root != roots[root]) {
                root = roots[root];
            }
            // 路径压缩
            while (i != roots[i]) {
                int tmp = roots[i];
                roots[i] = root;
                i = tmp;
            }
            return root;
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
