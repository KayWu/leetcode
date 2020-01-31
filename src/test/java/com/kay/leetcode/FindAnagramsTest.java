package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindAnagramsTest {


    private FindAnagrams solution;

    @BeforeEach
    void setUp() {
        solution = new FindAnagrams();
    }

    @Test
    void sample() {
        assertThat(solution.findAnagrams("cbaebabacd", "abc"), containsInAnyOrder(0, 6));
        assertThat(solution.findAnagrams("abab", "ab"), containsInAnyOrder(0, 1, 2));
    }

    @Test
    void empty() {
        assertTrue(solution.findAnagrams(null, null).isEmpty());
        assertTrue(solution.findAnagrams("", "a").isEmpty());
        assertTrue(solution.findAnagrams("a", "").isEmpty());
    }
}
