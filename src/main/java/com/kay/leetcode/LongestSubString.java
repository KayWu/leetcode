package com.kay.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0, i = 0, j = 0;
        while (i < n && j < n) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                i++;
                maxLength = Math.max(i - j, maxLength);
            } else {
                set.remove(c);
                j++;
            }
        }
        return maxLength;
    }
}

