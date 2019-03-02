package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfIslandsTest {

    private NumberOfIslands solution;

    @BeforeEach
    void setUp() {
        solution = new NumberOfIslands();
    }

    @Test
    void sample() {
        assertEquals(1, solution.numIslands(BoardUtil.board(Arrays.asList(
                "11110",
                "11010",
                "11000",
                "00000"
        ))));

        assertEquals(3, solution.numIslands(BoardUtil.board(Arrays.asList(
                "11000",
                "11000",
                "00100",
                "00011"
        ))));
    }

    @Test
    void zeroLength() {
        assertEquals(0, solution.numIslands(new char[0][0]));
    }
}