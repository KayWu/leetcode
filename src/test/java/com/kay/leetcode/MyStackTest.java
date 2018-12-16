package com.kay.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyStackTest {

    @Test
    void test() {
        MyStack stack = new MyStack();
        assertTrue(stack.empty());
        stack.push(1);
        assertFalse(stack.empty());
        stack.push(2);
        assertThat(stack.pop(), equalTo(2));
        stack.push(3);
        assertThat(stack.top(), equalTo(3));
        assertThat(stack.pop(), equalTo(3));
        stack.push(4);
        assertThat(stack.pop(), equalTo(4));
        assertThat(stack.pop(), equalTo(1));
        assertTrue(stack.empty());
    }

}