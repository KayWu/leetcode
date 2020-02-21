package com.kay.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int j = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == null) {
                ans = Math.max(i - j + 1, ans);
            } else {
                int prev = map.get(c);
                if (prev >= j) {
                    j = prev + 1;
                } else {
                    ans = Math.max(i - j + 1, ans);
                }
            }
            map.put(c, i);
        }
        return ans;
    }
}

