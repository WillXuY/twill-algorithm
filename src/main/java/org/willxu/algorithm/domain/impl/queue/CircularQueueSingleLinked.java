package org.willxu.algorithm.domain.impl.queue;

import org.willxu.algorithm.domain.queue.AbstractCircularQueue;

/**
 * Design your implementation of the circular queue. The circular queue is
 * a linear data structure in which the operations are performed based on
 * FIFO (First In First Out) principle and the last position is connected
 * back to the first position to make a circle. It is also called "Ring
 * Buffer".
 * One of the benefits of the circular queue is that we can make use of the
 * spaces in front of the queue. In a normal queue, once the queue becomes
 * full, we cannot insert the next element even if there is a space in
 * front of the queue. But using the circular queue, we can use the space
 * to store new values.
 * Your implementation should support following operations:
 * - MyCircularQueue(k): Constructor, set the size of the queue to be k.
 * - front: Get the front item from the queue. If the queue is empty,
 *   return -1.
 * - rear: Get the last item from the queue. If the queue is empty,
 *   return -1.
 * - enQueue(value): Insert an element into the circular queue. Return true
 *   if the operation is successful.
 * - deQueue(): Delete an element from the circular queue. Return true if
 *   the operation is successful.
 * - isEmpty(): Checks whether the circular queue is empty or not.
 * - isFull(): Checks whether the circular queue is full or not.
 * Note:
 * - All values will be in the range of [0, 1000].
 * - The number of operations will be in the range of [1, 1000].
 * - Please do not use the built-in Queue library.
 */
public final class CircularQueueSingleLinked extends AbstractCircularQueue {
    private Node<Integer> first;
    /**
     * add the last node
     */
    private Node<Integer> last;

    /**
     * 单向链表结构
     * 总结： 参考 LinkedList 然后直接用 new Node 来操作容易出错，
     * 添加 changeNext 来方便修改引用
     * @param <Integer> All values will be in the range of [0, 1000]
     */
    private static class Node<Integer> {
        Integer item;
        Node<Integer> next;

        Node(Integer item, Node<Integer> next) {
            this.item = item;
            this.next = next;
        }

        void changeNext(Node<Integer> next) {
            this.next = next;
        }
    }

    public CircularQueueSingleLinked(int k) {
        super(k);
    }

    @Override
    public boolean enQueue(int value) {
        if (size == MAX_SIZE) {
            return false;
        } else if (size == 0) {
            first = new Node<>(value, null);
            last = first;
            size = 1;
            return true;
        } else if (size == 1) {
            last = new Node<>(value, first);
            first.changeNext(last);
            size = 2;
            return true;
        } else if (size == 2) {
            Node<Integer> add = new Node<>(value, first);
            last.changeNext(add);
            last = add;
            size++;
            return true;
        }
        // first.prev 为队列的最后一个结点
        Node<Integer> add = new Node<>(value, first);
        last.changeNext(add);
        last = add;
        size++;
        return true;
    }

    @Override
    public boolean deQueue() {
        if (size == 0) {
            return false;
        } else if (size == 1) {
            first = null;
            size = 0;
            return true;
        } else if (size == 2) {
            first = new Node<>(last.item, null);
            last = null;
            size = 1;
            return true;
        }
        // 移除 first.prev 引用 first.prev.prev 指向 first first 再指向 f.p.p
        Node<Integer> next = first.next;
        last.changeNext(next);
        first = first.next;
        size --;
        return true;
    }

    @Override
    public int front() {
        if (size == 0) {
            return -1;
        }
        return first.item;
    }

    /**
     * 错误原因： 题目要求所有size的环形队列需要全都有值
     * 取巧， size < MAX_SIZE 时返回0
     */
    @Override
    public int rear() {
        if (size == 0) {
            return -1;
        } else if (size == 1) {
            return first.item;
        }
        return last.item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == MAX_SIZE;
    }
}
