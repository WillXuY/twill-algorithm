/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0225_my_queues_stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement a last-in-first-out (LIFO) stack using only two queues.
 * The implemented stack should support all the functions of a normal
 * stack (push, top, pop and empty).
 *
 * Notes:
 * - You must use only standard operations of a queue, which means that
 *   only push to back, peek/pop from front, size and is empty
 *   operations are valid.
 * - Depending on your language, the queue may not be supported
 *   natively. You may simulate a queue using a list or deque
 *   (double-ended queue) as long as you use only a queue's standard
 *   operations.
 *
 * Constraints:
 * - 1 <= x <= 9
 * - At most 100 calls will be made to push, pop, top and empty.
 * - All the calls to pop and top are valid.
 *
 * Implement:
 *        element               | push | pop |
 * Stack:   5 -> 4 -> 3 -> 2 -> 1 | 5    | 5   |
 * queue:   5 -> 4 -> 3 -> 2 -> 1 | 5    | 1   |
 * reverse: 1 -> 2 -> 3 -> 4 -> 5 | 1    | 5   |
 */
public class MyStackUsingQueues extends MyStack {
    private Queue<Integer> reverseOrder;

    public MyStackUsingQueues() {
        reverseOrder = new LinkedList<>();
    }

    @Override
    public void push(int x) {
        Queue<Integer> newReverse = new LinkedList<>();
        newReverse.offer(x);
        while (!reverseOrder.isEmpty()) {
            newReverse.offer(reverseOrder.poll());
        }
        reverseOrder = newReverse;
    }

    @Override
    public int pop() {
        if (reverseOrder.isEmpty()) {
            return 0;
        }
        return reverseOrder.poll();
    }

    @Override
    public int top() {
        if (reverseOrder.isEmpty()) {
            return 0;
        }
        return reverseOrder.peek();
    }

    @Override
    public boolean empty() {
        return reverseOrder.isEmpty();
    }
}
