package com.kay.leetcode;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 * dp 优化为两个变量，减少空间占用
 */
public class MaxProfitWithFee {
    public int maxProfit(int[] prices, int fee) {
        if (prices == null) {
            throw new IllegalArgumentException();
        }
        if (prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        int cash = 0;
        int hold = -prices[0];
        for (int i = 1; i < n; i++) {
            int prevCash = cash;
            cash = Math.max(prevCash, hold + prices[i] - fee);
            hold = Math.max(hold, prevCash - prices[i]);
        }
        return cash;
    }


}
