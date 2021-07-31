/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.impl.stack;

import org.willxu.algorithm.domain.stack.AbstractMinStack;
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
public class MinStack extends AbstractMinStack {
    private TreeMap<Integer, Integer> map;

    private ListNode head;

    /**
     * Initializes the stack object.
     */
    public MinStack() {}

    /**
     * Pushed the element val onto the stack.
     *
     * @param val the value of element.
     */
    public void push(int val) {
        if (map == null) {
            map = new TreeMap<>();
        }
        if (map.containsKey(val)) {
            map.put(val, map.get(val) + 1);
        } else {
            map.put(val, 1);
        }
        if (head == null) {
            head = new ListNode(val);
        } else {
            head = new ListNode(val, head);
        }
    }

    /**
     * Removes the element on the top of the stack.
     */
    public void pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        int top = top();
        map.put(top, map.get(top) - 1);
        if (map.get(top) == 0) {
            map.remove(top);
        }
        head = head.next;
    }

    /**
     * Gets the top element of the stack.
     *
     * @return the value of the top element.
     */
    public int top() {
        if (head == null) {
            throw new EmptyStackException();
        }
        return head.val;
    }

    /**
     * Retrieves the minimum element in the stack.
     * @return the value of minimum element.
     */
    public int getMin() {
        return map.keySet().iterator().next();
    }
}
