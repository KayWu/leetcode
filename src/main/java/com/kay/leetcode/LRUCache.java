package com.kay.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/lru-cache/
 */
class LRUCache {

    private int capacity;
    private int count;
    private Map<Integer, ListNode> map;
    private ListNode head;
    private ListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        this.map = new HashMap<>();
        this.head = new ListNode(-1, -1);
        this.tail = new ListNode(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        ListNode node = map.get(key);
        if (node == null) {
            return -1;
        }
        deleteNode(node);
        moveToHead(node);
        return node.val;
    }


    public void put(int key, int value) {
        ListNode node = map.get(key);
        if (node == null) {
            node = new ListNode(key, value);
            this.map.put(key, node);
            moveToHead(node);
            this.count++;
            if (this.count > this.capacity) {
                ListNode toDelete = this.tail.prev;
                deleteNode(toDelete);
                this.map.remove(toDelete.key);
                count--;
            }
        } else {
            node.val = value;
            deleteNode(node);
            moveToHead(node);
        }

    }

    private void moveToHead(ListNode cur) {
        cur.next = this.head.next;
        cur.prev = this.head;
        this.head.next.prev = cur;
        this.head.next = cur;
    }

    private void deleteNode(ListNode cur) {
        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;
    }

    private static class ListNode {
        ListNode prev;
        ListNode next;
        int key;
        int val;

        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }

    }
}
