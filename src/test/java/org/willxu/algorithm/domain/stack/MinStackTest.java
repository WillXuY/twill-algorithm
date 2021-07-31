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
import org.willxu.algorithm.domain.impl.stack.MinStack;
import org.willxu.algorithm.domain.stack.AbstractMinStack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {
    @Test
    public void testMinStack() {
        AbstractMinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }
}
