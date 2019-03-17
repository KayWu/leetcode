package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShipWithinDaysTest {

    private ShipWithinDays solution;

    @BeforeEach
    void setUp() {
        solution = new ShipWithinDays();
    }

    @Test
    void sample() {
        assertEquals(15, solution.shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
        assertEquals(6, solution.shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 3));
        assertEquals(3, solution.shipWithinDays(new int[]{1, 2, 3, 1, 1}, 4));
    }
}