package com.kay.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */
public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || p == null || p.length() > s.length() || p.length() == 0) {
            return ans;
        }
        int[] map = new int[26];
        int toMatch = p.length();

        for (char c : p.toCharArray()) {
            map[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char add = s.charAt(i);
            if (map[add - 'a'] > 0) {
                toMatch--;
            }
            map[add - 'a']--;

            if (i >= p.length()) {
                char remove = s.charAt(i - p.length());
                if (map[remove - 'a'] >= 0) {
                    toMatch++;
                }
                map[remove - 'a']++;
            }
            if (i >= p.length() - 1) {
                if (toMatch == 0) {
                    ans.add(i - p.length() + 1);
                }
            }
        }
        return ans;
    }

}
