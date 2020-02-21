package com.kay.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    private BinarySearch solution;

    @BeforeEach
    void setUp() {
        solution = new BinarySearch();
    }

    @Nested
    class Search {

        @Test
        void empty() {
            assertEquals(-1, solution.search(new int[]{}, 1));
        }

        @Test
        void sample() {
            assertEquals(0, solution.search(new int[]{1}, 1));
            assertEquals(0, solution.search(new int[]{1, 2}, 1));
            assertEquals(1, solution.search(new int[]{1, 2}, 2));
            assertEquals(1, solution.search(new int[]{1, 2, 3}, 2));
        }

        @Test
        void notFound() {
            assertEquals(-1, solution.search(new int[]{1, 2, 3}, 4));
            assertEquals(-1, solution.search(new int[]{1, 2, 3}, 0));
        }
    }

    @Nested
    class SearchFirst {
        @Test
        void empty() {
            assertEquals(-1, solution.search(new int[]{}, 1));
        }

        @Test
        void notFound() {
            assertEquals(-1, solution.searchFirst(new int[]{1, 2, 2, 3}, 0));
        }

        @Test
        void sample() {
            assertEquals(0, solution.searchFirst(new int[]{1, 2, 2, 3}, 1));
            assertEquals(1, solution.searchFirst(new int[]{1, 2, 2, 3}, 2));
            assertEquals(3, solution.searchFirst(new int[]{1, 2, 2, 3}, 3));
            assertEquals(1, solution.searchFirst(new int[]{1, 2, 2}, 2));
            assertEquals(1, solution.searchFirst(new int[]{1, 2}, 2));
        }

    }

    @Nested
    class SearchFirstBiggerEqualThan {

        @Test
        void empty() {
            assertEquals(-1, solution.searchFirstBiggerEqualThan(new int[]{}, 1));
        }

        @Test
        void notFound() {
            assertEquals(-1, solution.searchFirstBiggerEqualThan(new int[]{1, 2, 3}, 4));
        }

        @Test
        void sample() {
            assertEquals(0, solution.searchFirstBiggerEqualThan(new int[]{1, 2, 2, 3}, 0));
            assertEquals(0, solution.searchFirstBiggerEqualThan(new int[]{1, 2, 2, 3}, 1));
            assertEquals(1, solution.searchFirstBiggerEqualThan(new int[]{1, 2, 2, 3}, 2));
            assertEquals(3, solution.searchFirstBiggerEqualThan(new int[]{1, 2, 2, 3}, 3));
        }

    }
}
