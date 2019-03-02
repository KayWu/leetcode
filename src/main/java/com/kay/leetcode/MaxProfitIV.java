package com.kay.leetcode;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
 */
public class MaxProfitIV {
    public int maxProfit(int k, int[] prices) {
        if (prices == null) {
            throw new IllegalArgumentException();
        }
        if (prices.length == 0 || k == 0) {
            return 0;
        }

        int n = prices.length;

        // 退化
        if (k > n) {
            int profit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;
        }

        // 分别表示第几天，交易次数，所持股票数量
        int[][][] profit = new int[n][k + 1][2];
        for (int i = 0; i <= k; i++) {
            profit[0][i][1] = Integer.MIN_VALUE / 2;
        }
        profit[0][1][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            profit[i][0][1] = profit[i - 1][0][1];
            profit[i][0][0] = profit[i][0][0];
            for (int j = 1; j <= k; j++) {
                profit[i][j][1] = Math.max(profit[i - 1][j][1], profit[i - 1][j - 1][0] - prices[i]);
                profit[i][j][0] = Math.max(profit[i - 1][j][0], profit[i - 1][j][1] + prices[i]);
            }
        }

        int maxProfit = 0;
        for (int i = 0; i <= k; i++) {
            maxProfit = Math.max(maxProfit, profit[n - 1][i][0]);
        }
        return maxProfit;
    }
}
