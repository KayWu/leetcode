package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchRotatedSortedArrayTest {

    private SearchRotatedSortedArray solution;


    @BeforeEach
    void setUp() {
        solution = new SearchRotatedSortedArray();
    }

    @Test
    void sample() {
        assertEquals(4, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(-1, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }
}
