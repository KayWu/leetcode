package com.kay.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCacheTest {

    @Test
    void sample() {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));
        cache.put(3, 3); // evicts key 2
        assertEquals(-1, cache.get(2));
        cache.put(4, 4); // evicts key 1
        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }

    @Test
    void capacityOne() {
        LRUCache cache = new LRUCache(1);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
    }

    @Test
    void capacityZero() {
        LRUCache cache = new LRUCache(0);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(-1, cache.get(1));
        assertEquals(-1, cache.get(2));
    }

}