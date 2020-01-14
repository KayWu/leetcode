package com.kay.leetcode;

/**
 * https://leetcode.com/problems/minimum-distance-to-type-a-word-using-two-fingers/
 */
public class MinimumDistance {

    public int minimumDistance(String word) {
        if (word == null) {
            throw new IllegalArgumentException();
        }
        int[][][] dp = new int[word.length() + 1][27][27];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < 27; j++) {
                for (int k = 0; k < 27; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return minimumDistance(word, 0, (char) 26, (char) 26, dp);
    }

    private int minimumDistance(String word, int pos, char left, char right, int[][][] dp) {
        if (pos >= word.length()) {
            return 0;
        }
        if (dp[pos][left][right] == -1) {
            char to = (char) (word.charAt(pos) - 'A');
            dp[pos][left][right] = Math.min(distance(left, to) + minimumDistance(word, pos + 1, to, right, dp),
                    distance(right, to) + minimumDistance(word, pos + 1, to, left, dp));
        }
        return dp[pos][left][right];
    }


    private int distance(char from, char to) {
        if (from == 26) {
            return 0;
        }
        return Math.abs(from / 6 - to / 6) + Math.abs(from % 6 - to % 6);
    }

}
