package com.kay.leetcode;

import com.kay.utils.TreeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinDepthTest {

    private MinDepth solution;

    @BeforeEach
    void setUp() {
        solution = new MinDepth();
    }

    @Test
    void sample() {
        assertEquals(2, solution.minDepth(TreeUtil.buildTree(Arrays.asList(3, 9, 20, null, null, 15, 7))));
    }

    @Test
    void emptyTree() {
        assertEquals(0, solution.minDepth(null));
    }
}