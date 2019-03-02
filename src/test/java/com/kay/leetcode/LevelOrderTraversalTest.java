package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LevelOrderTraversalTest {

    private LevelOrderTraversal solution;

    @BeforeEach
    void setUp() {
        solution = new LevelOrderTraversal();
    }

    @Test
    void sample() {
        assertThat(solution.levelOrder(TreeUtil.buildTree(Arrays.asList(3, 9, 20, null, null, 15, 7))),
                contains(Arrays.asList(3), Arrays.asList(9, 20), Arrays.asList(15, 7)));
    }

    @Test
    void emptyTree() {
        assertTrue(solution.levelOrder(null).isEmpty());
    }
}