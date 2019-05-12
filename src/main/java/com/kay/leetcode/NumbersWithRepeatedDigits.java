package com.kay.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/numbers-with-repeated-digits/
 */
public class NumbersWithRepeatedDigits {
    public int numDupDigitsAtMostN(int N) {
        int count = 0;
        List<Integer> digits = new ArrayList<>();

        for (int num = N; num > 0; num /= 10) {
            digits.add(0, num % 10);
        }

        int n = digits.size();
        for (int i = 1; i < n; i++) {
            count += 9 * A(9, i - 1);
        }

        Set<Integer> usedDigits = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int digit = digits.get(i);
            int bottom = i == 0 ? 1 : 0;
            int up = i == n - 1 ? digit + 1 : digit;
            for (int j = bottom; j < up; j++) {
                if (!usedDigits.contains(j)) {
                    count += A(9 - i, n - i - 1);
                }
            }
            if (usedDigits.contains(digit)) break;
            usedDigits.add(digit);
        }
        return N - count;
    }


    private int A(int m, int n) {
        return n == 0 ? 1 : A(m, n - 1) * (m - n + 1);
    }
}
