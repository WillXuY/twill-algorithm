/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.queue;

/**
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal
 * queue (push, peek, pop and empty).
 */
public interface Queue {
    /**
     * Pushed element x to the back of the queue.
     * @param x element
     */
    void push(int x);

    /**
     * Removes the element from the front of the queue and returns it.
     * @return the top element
     */
    int pop();

    /**
     * Returns the element at the front of the queue.
     * @return the top element
     */
    int peek();

    /**
     * Returns whether the queue is empty, false other wise.
     * @return returns whether the queue is empty, false other wise.
     */
    boolean empty();
}
