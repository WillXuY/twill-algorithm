package org.willxu.algorithm.domain.stack;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.stack.MyStackUsingQueues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyQueuesStackTest {
    @Test
    public void testMyStackUsingQueues() {
        MyStack myStack = new MyStackUsingQueues();
        myStack.push(1);
        myStack.push(2);
        assertEquals(2, myStack.top());
        assertEquals(2, myStack.pop());
        assertFalse(myStack.empty());
    }
}
