package com.kay.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/lru-cache/
 */
public class LRUCache {

    private int capacity;
    private int count;
    private Map<Integer, DLinkedNode> map;
    private DLinkedNode headDummy;
    private DLinkedNode tailDummy;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        this.map = new HashMap<>(capacity);
        this.headDummy = new DLinkedNode();
        this.tailDummy = new DLinkedNode();
        headDummy.post = tailDummy;
        tailDummy.pre = headDummy;
    }

    public int get(int key) {
        DLinkedNode node = map.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = map.get(key);
        if (node == null) {
            node = new DLinkedNode();
            node.key = key;
            node.value = value;
            addNode(node);
            map.put(key, node);
            count++;
            if (count > capacity) {
                map.remove(removeTail().key);
                count--;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }

    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addNode(node);
    }

    private void removeNode(DLinkedNode node) {
        node.pre.post = node.post;
        node.post.pre = node.pre;
    }

    private DLinkedNode removeTail() {
        DLinkedNode tail = tailDummy.pre;
        removeNode(tailDummy.pre);
        return tail;
    }

    private void addNode(DLinkedNode node) {
        DLinkedNode postNode = this.headDummy.post;
        postNode.pre = node;
        node.post = postNode;
        this.headDummy.post = node;
        node.pre = this.headDummy;
    }

    private static class DLinkedNode {
        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode post;
    }
}
