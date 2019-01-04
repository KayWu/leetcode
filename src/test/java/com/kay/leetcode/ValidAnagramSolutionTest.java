package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramSolutionTest {

    private ValidAnagramSolution solution;

    @BeforeEach
    void setup() {
        solution = new ValidAnagramSolution();
    }

    @Test
    void testNullString() {
        assertThrows(IllegalArgumentException.class, () -> solution.isAnagram(null, null));
        assertThrows(IllegalArgumentException.class, () -> solution.isAnagram("", null));
        assertThrows(IllegalArgumentException.class, () -> solution.isAnagram(null, ""));
    }

    @Test
    void testNotSameSizeString() {
        assertFalse(solution.isAnagram("aa", "a"));
        assertFalse(solution.isAnagram("a", "aa"));
        assertFalse(solution.isAnagram("", "a"));
        assertFalse(solution.isAnagram("a", ""));
    }

    @Test
    void testSameString() {
        String s1 = "aaa";
        String s2 = "abc";
        assertTrue(solution.isAnagram(s1, s1));
        assertTrue(solution.isAnagram(s2, s2));
    }

    @Test
    void testAnagramString() {
        assertTrue(solution.isAnagram("abc", "bca"));
        assertTrue(solution.isAnagram("abc", "cba"));
        assertTrue(solution.isAnagram("aabbcc", "ccbbaa"));
        assertTrue(solution.isAnagram("aabbcc", "bbaacc"));
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void testNotAnagramString() {
        assertFalse(solution.isAnagram("ret", "car"));
        assertFalse(solution.isAnagram("apple", "ppled"));
    }


}