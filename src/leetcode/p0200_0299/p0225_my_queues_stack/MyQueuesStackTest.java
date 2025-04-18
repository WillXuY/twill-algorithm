/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.stack;

import org.junit.jupiter.api.Test;
import leetcode.p0100_0199.p0155_min_stack.MyStackUsingQueues;

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
