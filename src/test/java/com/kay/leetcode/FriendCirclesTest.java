package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FriendCirclesTest {

    private FriendCircles solution;

    @BeforeEach
    void setUp() {
        solution = new FriendCircles();
    }


    @Test
    void sample() {
        assertEquals(2, solution.findCircleNum(new int[][]{
                new int[]{1, 1, 0},
                new int[]{1, 1, 0},
                new int[]{0, 0, 1}
        }));
        assertEquals(1, solution.findCircleNum(new int[][]{
                new int[]{1, 1, 0},
                new int[]{1, 1, 1},
                new int[]{0, 1, 1}
        }));
    }

    @Test
    void zeroLength() {
        assertEquals(0, solution.findCircleNum(new int[0][0]));
    }

    @Test
    void complex() {
        assertEquals(1, solution.findCircleNum(new int[][]{
                new int[]{1, 0, 0, 1},
                new int[]{0, 1, 1, 0},
                new int[]{0, 1, 1, 1},
                new int[]{1, 0, 1, 1}
        }));
    }
}