package com.kay.leetcode;

import java.util.HashMap;
import java.util.Map;

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
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }

        for (Character c : t.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            map.put(c, count - 1);
        }

        for (Integer count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
