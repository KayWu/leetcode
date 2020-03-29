package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence solution;

    @BeforeEach
    public void setUp() {
        solution = new LongestCommonSubsequence();

    }

    @Test
    void sample() {
        assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
        assertEquals(3, solution.longestCommonSubsequence("abc", "abc"));
        assertEquals(0, solution.longestCommonSubsequence("abc", "def"));
    }


}
