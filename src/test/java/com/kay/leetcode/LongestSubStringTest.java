package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStringTest {

    private LongestSubString solution;

    @BeforeEach
    void setUp() {
        solution = new LongestSubString();
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
    void empty() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }
}