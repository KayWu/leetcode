package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignCookiesTest {

    private AssignCookies solution;

    @BeforeEach
    public void setUp() {
        solution = new AssignCookies();
    }

    @Test
    void sample() {
        assertEquals(1, solution.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        assertEquals(2, solution.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

    @Test
    void unordered() {
        assertEquals(2, solution.findContentChildren(new int[]{2, 1}, new int[]{1, 2, 3}));
    }


}
