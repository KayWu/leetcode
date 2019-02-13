package com.kay.leetcode;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class MaxProfitSolution {
    public int maxProfit(int[] prices) {
        if (prices == null) {
            throw new IllegalArgumentException();
        }
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
