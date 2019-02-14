package com.kay.leetcode;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 */
public class MaxProfitIIISolution {

    public int maxProfit(int[] prices) {
        if (prices == null) {
            throw new IllegalArgumentException();
        }
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        // 分别表示第几天，交易次数，所持股票数量
        // 买入视为一次交易
        // Integer.MIN_VALUE / 2 防止溢出
        int[][][] profit = new int[n][3][2];
        profit[0][0][0] = 0;
        profit[0][0][1] = Integer.MIN_VALUE / 2;
        profit[0][1][0] = Integer.MIN_VALUE / 2;
        profit[0][1][1] = -prices[0];
        profit[0][2][0] = Integer.MIN_VALUE / 2;
        profit[0][2][1] = Integer.MIN_VALUE / 2;
        for (int i = 1; i < n; i++) {
            profit[i][0][0] = profit[i - 1][0][0];
            profit[i][0][1] = profit[i - 1][0][1];
            profit[i][1][1] = Math.max(profit[i - 1][1][1], profit[i - 1][0][0] - prices[i]);
            profit[i][2][1] = Math.max(profit[i - 1][2][1], profit[i - 1][1][0] - prices[i]);
            profit[i][1][0] = Math.max(profit[i - 1][1][0], profit[i - 1][1][1] + prices[i]);
            profit[i][2][0] = Math.max(profit[i - 1][2][0], profit[i - 1][2][1] + prices[i]);
        }
        return Math.max(profit[n - 1][0][0], Math.max(profit[n - 1][1][0], profit[n - 1][2][0]));
    }
}
