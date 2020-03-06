package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetworkDelayTimeTest {

    private NetworkDelayTime solution;

    @BeforeEach
    void setUp() {
        solution = new NetworkDelayTime();
    }


    @Test
    void sample() {
        assertEquals(2, solution.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2));
    }


    @Test
    void impossible() {
        assertEquals(-1, solution.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 1));
    }



}
