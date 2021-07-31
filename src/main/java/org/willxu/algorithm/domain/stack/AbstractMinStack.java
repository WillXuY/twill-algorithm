/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.stack;

import org.willxu.algorithm.provide.ListNode;

import java.util.EmptyStackException;
import java.util.TreeMap;

/**
 * Design a stack that supports push, pop, top, and retrieving the
 * minimum element in constant time.
 *
 * Implement the MinStack class:
 *
 */
public abstract class AbstractMinStack {
    /**
     * Initializes the stack object.
     */
    public AbstractMinStack() {}

    /**
     * Pushed the element val onto the stack.
     *
     * @param val the value of element.
     */
    public abstract void push(int val);

    /**
     * Removes the element on the top of the stack.
     */
    public abstract void pop();

    /**
     * Gets the top element of the stack.
     *
     * @return the value of the top element.
     */
    public abstract int top();

    /**
     * Retrieves the minimum element in the stack.
     * @return the value of minimum element.
     */
    public abstract int getMin();
}
