package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {

    private MajorityElement solution;

    @BeforeEach
    void setUp() {
        solution = new MajorityElement();
    }

    @Test
    void singletonArray() {
        int majority = solution.majorityElement(new int[]{1});
        assertEquals(1, majority);
    }

    @Test
    void sample() {
        int majority = solution.majorityElement(new int[]{3, 2, 3});
        assertEquals(3, majority);
    }

    @Test
    void sample2() {
        int majority = solution.majorityElement(new int[]{2, 2, 1, 1, 2, 2});
        assertEquals(2, majority);
    }

    @Test
    void notFirstElementMajority() {
        int majority = solution.majorityElement(new int[]{2, 1, 1, 2, 1, 1, 2});
        assertEquals(1, majority);
    }
}