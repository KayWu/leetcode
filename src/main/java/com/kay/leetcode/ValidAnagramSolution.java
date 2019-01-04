package com.kay.leetcode;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagramSolution {

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            throw new IllegalArgumentException();
        }
        if (s.length() != t.length()) {
            return false;
        }

        int[] map = new int[26];
        for (Character c : s.toCharArray()) {
            int ord = c - 'a';
            map[ord] = map[ord] + 1;
        }
        for (Character c : t.toCharArray()) {
            int ord = c - 'a';
            int remainCount = map[ord];
            if (remainCount <= 0) {
                return false;
            }
            map[ord] = remainCount - 1;
        }
        for (int remainCount : map) {
           if (remainCount != 0) {
               return false;
           }
        }
        return true;
    }
}
