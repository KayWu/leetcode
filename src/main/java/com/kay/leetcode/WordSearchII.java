package com.kay.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/word-search-ii/
 */
public class WordSearchII {

    private static final int R = 26;
    private static char BEGIN_LETTER = 'a';

    private static class Node {
        private Node[] next = new Node[R];
        private boolean isWord;
    }

    private static class Trie {
        private Node root;

        private Trie() {
            root = new Node();
        }

        private void insert(String word) {
            Node node = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (node.next[c - BEGIN_LETTER] == null) {
                    node.next[c - BEGIN_LETTER] = new Node();
                }
                node = node.next[c - BEGIN_LETTER];
                if (i == word.length() - 1) {
                    node.isWord = true;
                }
            }
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        Set<String> set = new HashSet<>();

        int n = board.length;
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, visited, i, j, "", trie.root, set);
            }
        }
        return new ArrayList<>(set);
    }

    private void dfs(char[][] board, boolean[][] visited, int i, int j, String str, Node node, Set<String> set) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || visited[i][j]) {
            return;
        }
        char c = board[i][j];
        node = node.next[c - BEGIN_LETTER];
        if (node == null) {
            return;
        }
        str += c;
        if (node.isWord) {
            set.add(str);
        }

        visited[i][j] = true;
        dfs(board, visited, i - 1, j, str, node, set);
        dfs(board, visited, i + 1, j, str, node, set);
        dfs(board, visited, i, j - 1, str, node, set);
        dfs(board, visited, i, j + 1, str, node, set);
        visited[i][j] = false;
    }


}
