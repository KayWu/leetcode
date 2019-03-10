package com.kay.leetcode;

import com.kay.leetcode.utils.BoardUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class WordSearchIITest {

    private WordSearchII solution;

    @BeforeEach
    void setUp() {
        solution = new WordSearchII();
    }

    @Test
    void sample() {
        char[][] board = BoardUtil.board(Arrays.asList(
                "oaan",
                "etae",
                "ihkr",
                "iflv")
        );
        String[] words = new String[]{"oath", "pea", "eat", "rain"};
        assertThat(solution.findWords(board, words), containsInAnyOrder("eat", "oath"));
    }

    @Test
    void nonSquare() {
        char[][] board = BoardUtil.board(Arrays.asList(
                "oaant",
                "etaea",
                "ihkre",
                "iflvh")
        );
        String[] words = new String[]{"oath", "pea", "eat", "rain", "heat"};
        assertThat(solution.findWords(board, words), containsInAnyOrder("eat", "oath", "heat"));
    }
}