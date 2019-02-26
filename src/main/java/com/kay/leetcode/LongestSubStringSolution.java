package com.kay.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubStringSolution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int j = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(s.charAt(i));
                length++;
            } else {
                maxLength = Math.max(maxLength, length);
                while (s.charAt(j) != c) {
                    set.remove(s.charAt(j));
                    j++;
                }
                j++;
                length = i - j + 1;
            }
        }
        maxLength = Math.max(maxLength, length);
        return maxLength;
    }
}
