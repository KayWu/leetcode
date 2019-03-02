package com.kay.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GenerateParenthesesTest {

    private GenerateParentheses solution;

    @BeforeEach
    void setUp() {
        solution = new GenerateParentheses();
    }

    @Test
    void sample() {
        List<String> result = solution.generateParenthesis(3);
        assertThat(result, containsInAnyOrder(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"));
    }

    @Test
    void empty() {
        assertThat(solution.generateParenthesis(0), containsInAnyOrder(""));
    }


    @Test
    void invalidN() {
        assertThrows(IllegalArgumentException.class, () -> {
            solution.generateParenthesis(-1);
        });
    }

}