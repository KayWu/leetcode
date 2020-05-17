package com.kay.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class KthLargestOfStreamTest {

    @Test
    void add() {
        int[] array = {1, 2, 3, 4, 5, 6};
        KthLargestOfStream kthLargestOfStream = new KthLargestOfStream(3, array);
        assertThat(kthLargestOfStream.add(7), equalTo(5));
        assertThat(kthLargestOfStream.add(8), equalTo(6));
        assertThat(kthLargestOfStream.add(3), equalTo(6));
        assertThat(kthLargestOfStream.add(7), equalTo(7));
        assertThat(kthLargestOfStream.add(10), equalTo(7));
        assertThat(kthLargestOfStream.add(12), equalTo(8));
    }

    @Test
    void singletonArray() {
        int[] array = {1};
        KthLargestOfStream kthLargestOfStream = new KthLargestOfStream(2, array);
        assertEquals(kthLargestOfStream.add(3), 1);
    }

    @Test
    void argumentIllegal() {
        int[] array = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> new KthLargestOfStream(5, array));
    }
}
