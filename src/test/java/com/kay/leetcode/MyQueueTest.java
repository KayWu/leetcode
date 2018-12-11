package com.kay.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyQueueTest {

    @Test
    void test() {
        MyQueue queue = new MyQueue();
        assertTrue(queue.empty());
        queue.push(1);
        queue.push(2);
        assertFalse(queue.empty());
        assertThat(queue.peek(), is(1));
        assertThat(queue.pop(), is(1));
        assertThat(queue.peek(), is(2));

        queue.push(3);
        assertThat(queue.pop(), is(2));
        assertThat(queue.pop(), is(3));
        assertTrue(queue.empty());
    }
}
