package com.kay.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class MyQueue {

    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stackIn.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (stackOut.empty()) {
            moveInToOut();
        }
        return stackOut.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (stackOut.empty()) {
            moveInToOut();
        }
        return stackOut.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stackIn.empty() && stackOut.empty();
    }

    private void moveInToOut() {
        while (!stackIn.empty()) {
            stackOut.push(stackIn.pop());
        }
    }
}
