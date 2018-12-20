package com.kay.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class KthLargestTest {

    @Test
    void add() {
        int[] array = {1, 2, 3, 4, 5, 6};
        KthLargest kthLargest = new KthLargest(3, array);
        assertThat(kthLargest.add(7), equalTo(5));
        assertThat(kthLargest.add(8), equalTo(6));
        assertThat(kthLargest.add(3), equalTo(6));
        assertThat(kthLargest.add(7), equalTo(7));
        assertThat(kthLargest.add(10), equalTo(7));
        assertThat(kthLargest.add(12), equalTo(8));
    }

    @Test
    void singleElement() {
        int[] array = {1};
        KthLargest kthLargest = new KthLargest(2, array);
        assertEquals(kthLargest.add(3), 1);
    }

    @Test
    void argumentIllegal() {
        int[] array = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> {
            new KthLargest(5, array);
        });
    }
}