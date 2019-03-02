package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        List<String> result = new ArrayList<>();
        gen(0, 0, n, "", result);
        return result;
    }

    private void gen(int usedLeft, int usedRight, int n, String combination, List<String> result) {
        if (usedLeft == n && usedRight == n) {
            result.add(combination);
        }

        if (usedLeft < n) {
            gen(usedLeft + 1, usedRight, n, combination + "(", result);
        }
        if (usedRight < n && usedLeft > usedRight) {
            gen(usedLeft, usedRight + 1, n, combination + ")", result);
        }

    }
}
