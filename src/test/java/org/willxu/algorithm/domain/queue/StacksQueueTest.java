/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.queue;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.queue.StacksQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StacksQueueTest {
    @Test
    public void testStacksQueue() {
        Queue stacksQueue = new StacksQueue();
        stacksQueue.push(1);
        stacksQueue.push(2);
        assertEquals(1, stacksQueue.peek());
        assertEquals(1, stacksQueue.pop());
        assertFalse(stacksQueue.empty());
    }
}
