package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumSquarefulPermsTest {

    private NumSquarefulPerms solution;

    @BeforeEach
    void setUp() {
        solution = new NumSquarefulPerms();
    }

    @Test
    void sample() {
        assertEquals(2, solution.numSquarefulPerms(new int[]{1, 17, 8}));
        assertEquals(1, solution.numSquarefulPerms(new int[]{2, 2, 2}));
    }
}