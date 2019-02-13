package com.kay.leetcode;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 */
public class MaxProfitIIISolution {

    private static final int T_LIMIT = 2;

    public int maxProfit(int[] prices) {
        if (prices == null) {
            throw new IllegalArgumentException();
        }
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        // i 表示第几天，j 表示交易次数
        int[][] withStock = new int[n][T_LIMIT + 1];
        int[][] withoutStock = new int[n][T_LIMIT + 1];
        withStock[0][0] = Integer.MIN_VALUE;
        withStock[0][1] = -prices[0];
        withStock[0][2] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            withStock[i][1] = Math.max(withStock[i - 1][1], withoutStock[i - 1][0] - prices[i]);
            withStock[i][2] = Math.max(withStock[i - 1][2], withoutStock[i - 1][1] - prices[i]);
            withoutStock[i][1] = Math.max(withStock[i - 1][1] + prices[i], withoutStock[i - 1][1]);
            withoutStock[i][2] = Math.max(withStock[i - 1][2] + prices[i], withoutStock[i - 1][2]);
        }
        return Math.max(withoutStock[n - 1][0], Math.max(withoutStock[n - 1][1], withoutStock[n - 1][2]));
    }
}
