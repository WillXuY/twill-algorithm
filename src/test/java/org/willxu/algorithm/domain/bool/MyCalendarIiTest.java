package org.willxu.algorithm.domain.bool;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.bool.MyCalendarIiArray;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyCalendarIiTest {
    /**
     * Memory Limit Exceeded
     */
    @Test
    public void testArray() {
        MyCalendarIi array = new MyCalendarIiArray();
        assertTrue(array.book(10, 20));
        assertTrue(array.book(50, 60));
        assertTrue(array.book(10, 40));
        assertFalse(array.book(5, 15));
        assertTrue(array.book(5, 10));
        assertTrue(array.book(25, 55));
    }
}
