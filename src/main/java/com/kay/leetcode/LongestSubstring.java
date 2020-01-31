package com.kay.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (j < s.length()) {
            char c = s.charAt(j);
            Integer v = map.get(c);
            if (v == null || v < i) {
                ans = Math.max(ans, j - i + 1);
            } else {
                i = map.get(c) + 1;
            }
            map.put(c, j);
            j++;
        }
        return ans;
    }
}

