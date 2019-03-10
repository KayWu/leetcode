package com.kay.leetcode.utils;

import java.util.List;

public class BoardUtil {


    public static char[][] board(List<String> rowStrings) {
        int n = rowStrings.size();
        char[][] board = new char[n][rowStrings.get(0).length()];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < rowStrings.get(i).length(); j++) {
                board[i][j] = rowStrings.get(i).charAt(j);
            }
        }
        return board;
    }
}
