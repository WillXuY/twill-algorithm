/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.impl.queue;

import org.willxu.algorithm.domain.queue.Queue;

import java.util.Stack;

/**
 * You must use only standard operations of a stack, which means
 * only push to top, peek/pop from top, size and is empty operations
 * are valid.
 * Depending on your language, the stack may not be supported
 * natively. You may simulate a stack using a list or deque
 * (double-ended queue) as long as you use only a stack's standard
 * operations.
 *
 * Follow-up: Can you implement the queue such that each operation is
 * amortized O(1) time complexity? In other words, performing n
 * operations will take overall O(n) time even if one of those
 * operations may take longer.
 */
public class StacksQueue implements Queue {
    /**
     * You must use only standard operations of a stack, which means
     * only push to top, peek/pop from top, size and is empty operations
     * are valid.
     *
     * Queue:   5 -> 4 -> 3 -> 2 -> 1
     * reverse: 1 -> 2 -> 3 -> 4 -> 5
     */
    Stack<Integer> reversedStack;

    public StacksQueue() {
        reversedStack = new Stack<>();
    }

    /**
     * Pushed element x to the back of the queue.
     * @param x element
     */
    @Override
    public void push(int x) {
        Stack<Integer> positiveStack = reverseCloneStack(reversedStack);
        positiveStack.push(x);
        reversedStack = reverseCloneStack(positiveStack);
    }

    /**
     * Removes the element from the front of the queue and returns it.
     * @return the top element
     */
    @Override
    public int pop() {
        return reversedStack.pop();
    }

    /**
     * Returns the element at the front of the queue.
     * @return the top element
     */
    @Override
    public int peek() {
        return reversedStack.peek();
    }

    /**
     * Returns whether the queue is empty, false other wise.
     * @return returns whether the queue is empty, false other wise.
     */
    @Override
    public boolean empty() {
        return reversedStack.isEmpty();
    }

    private Stack<Integer> reverseCloneStack(final Stack<Integer> positive) {
        // todo: check cast.
        Stack<Integer> clone = (Stack<Integer>) positive.clone();
        Stack<Integer> reversed = new Stack<>();
        while (!clone.isEmpty()) {
            reversed.push(clone.pop());
        }
        return reversed;
    }
}
