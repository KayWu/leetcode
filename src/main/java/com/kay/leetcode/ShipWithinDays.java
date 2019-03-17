package com.kay.leetcode;

/**
 * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 */
public class ShipWithinDays {
    public int shipWithinDays(int[] weights, int D) {
        int left = 0;
        int right = 0;
        for (int w : weights) {
            left = Math.max(left, w);
            right = right + w;
        }

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canShip(weights, D, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canShip(int[] weights, int D, int capacity) {
        int current = 0;
        int count = 0;
        for (int w : weights) {
            current += w;
            if (current > capacity) {
                count += 1;
                current = w;
            }
        }
        count += 1;
        return count <= D;
    }
}
