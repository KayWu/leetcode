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
        for (char c : p.toCharArray()) {
            map[c - 'a']++;
        }
        int i = 0;
        int j = 0;
        int remain = p.length();
        while (j < s.length()) {
            char cj = s.charAt(j);
            if (map[cj - 'a'] > 0) {
                remain--;
            }
            map[cj - 'a']--;
            if (remain == 0) {
                ans.add(i);
            }
            if (j - i == p.length() - 1) {
                char ci = s.charAt(i);
                if (map[ci - 'a'] >= 0) {
                    remain++;
                }
                map[ci - 'a']++;
                i++;
            }
            j++;
        }
        return ans;
    }

}
