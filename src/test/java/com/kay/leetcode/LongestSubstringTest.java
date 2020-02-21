package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    private LongestSubstring solution;

    @BeforeEach
    void setUp() {
        solution = new LongestSubstring();
    }

    @Test
    void sample() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void allDiff() {
        assertEquals(3, solution.lengthOfLongestSubstring("abc"));
    }

    @Test
    void fail() {
        assertEquals(2, solution.lengthOfLongestSubstring("aab"));
        assertEquals(5, solution.lengthOfLongestSubstring("tmmzuxt"));

    }


    @Test
    void empty() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }
}