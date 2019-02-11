package com.kay.leetcode;

/**
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 */
public class Trie {

    private static final int R = 26;
    private static char BEGIN_LETTER = 'a';

    private static class Node {
        private Node[] next = new Node[R];
        private boolean isWord;
    }

    private Node root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new Node();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
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

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Node node = findNode(word);
        return node != null && node.isWord;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        return findNode(prefix) != null;
    }

    private Node findNode(String prefix) {
        Node node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            node = node.next[c - BEGIN_LETTER];
            if (node == null) {
                return null;
            }
        }
        return node;
    }
}

