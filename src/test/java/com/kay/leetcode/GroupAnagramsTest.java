package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class GroupAnagramsTest {

    private GroupAnagrams solution;

    @BeforeEach
    void setUp() {
        solution = new GroupAnagrams();
    }

    @Test
    void sample() {
        assertThat(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}),
                containsInAnyOrder(Arrays.asList(
                        containsInAnyOrder("ate", "eat", "tea"),
                        containsInAnyOrder("nat", "tan"),
                        containsInAnyOrder("bat"))));
    }

    @Test
    void duplicate() {
        assertThat(solution.groupAnagrams(new String[]{"", ""}),
                contains(Arrays.asList("", "")));
    }
}
