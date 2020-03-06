package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseScheduleTest {


    private CourseSchedule solution;

    @BeforeEach
    void setUp() {
        solution = new CourseSchedule();
    }


    @Test
    void sample() {
        assertTrue(solution.canFinish(2, new int[][]{{1, 0}}));
        assertFalse(solution.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }


}
