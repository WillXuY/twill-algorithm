/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0225_my_queues_stack;

public abstract class MyStack {
    /** Initialize your data structure here. */
    public MyStack() {}

    /** Push element x onto stack. */
    public abstract void push(int x);

    /** Removes the element on top of the stack and returns that element. */
    public abstract int pop();

    /** Get the top element. */
    public abstract int top();

    /** Returns whether the stack is empty. */
    public abstract boolean empty();
}
