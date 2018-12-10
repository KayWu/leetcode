package com.kay.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParenthesesSolution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (Character c : s.toCharArray()) {
            Character left = map.get(c);
            if (left != null) {
                if (stack.empty()) return false;
                Character toMatch = stack.pop();
                if (!left.equals(toMatch)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
