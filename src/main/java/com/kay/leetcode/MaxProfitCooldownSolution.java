package com.kay.leetcode;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
public class MaxProfitCooldownSolution {

    private static final int MINIMUM = Integer.MIN_VALUE / 2;

    public int maxProfit(int[] prices) {
        if (prices == null) {
            throw new IllegalArgumentException();
        }
        if (prices.length == 0) {
            return 0;
        }
        int n = prices.length;

        // 分别表示第几天，之后一天是否需要 Cool Down，所持股票数量
        int[][][] profit = new int[n][2][2];
        profit[0][0][0] = 0;
        profit[0][0][1] = -prices[0];
        profit[0][1][0] = MINIMUM;
        profit[0][1][1] = MINIMUM;

        for (int i = 1; i < n; i++) {
            profit[i][0][0] = Math.max(profit[i - 1][0][0], profit[i - 1][1][0]);
            profit[i][0][1] = Math.max(profit[i - 1][0][1], profit[i - 1][0][0] - prices[i]);
            profit[i][1][0] = profit[i - 1][0][1] + prices[i];
            profit[i][1][1] = MINIMUM;
        }

        return Math.max(profit[n - 1][0][0], profit[n - 1][1][0]);
    }
}
