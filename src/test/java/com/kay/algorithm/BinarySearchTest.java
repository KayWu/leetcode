package com.kay.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    private BinarySearch solution;

    @BeforeEach
    void setUp() {
        solution = new BinarySearch();
    }

    @Test
    void empty() {
        assertEquals(-1, solution.search(new int[]{}, 1));
    }

    @Test
    void one() {
        assertEquals(0, solution.search(new int[]{1}, 1));
    }


    @Test
    void two() {
        assertEquals(0, solution.search(new int[]{1, 2}, 1));
        assertEquals(1, solution.search(new int[]{1, 2}, 2));
    }

    @Test
    void three() {
        assertEquals(1, solution.search(new int[]{1, 2, 3}, 2));
    }

    @Test
    void notFound() {
        assertEquals(-1, solution.search(new int[]{1, 2, 3}, 4));
        assertEquals(-1, solution.search(new int[]{1, 2, 3}, 0));
    }
}
