package org.willxu.algorithm.domain;

import org.willxu.algorithm.domain.circularqueue.CircularQueueSingleLinked;
import org.willxu.algorithm.domain.circularqueue.CircularQueueDoubleLinked;
import org.junit.jupiter.api.Test;

public class DesignCircularQueueTest {
    /**
     * 优化 testCircularQueueDoubleLinked()
     */
    @Test
    public void testCircularQueueSingleLinked() {
        CircularQueueSingleLinked circularQueue = new CircularQueueSingleLinked(81);
        boolean flag = circularQueue.enQueue(69);
        boolean deQueue = circularQueue.deQueue();
        int front = circularQueue.front();
        int rear = circularQueue.rear();
        boolean isEmpty =  circularQueue.isEmpty();
        boolean isFull = circularQueue.isFull();
        System.out.println("result:" + flag + deQueue + front + rear + isEmpty + isFull);
    }

    @Test
    public void testCircularQueueDoubleLinked() {
        /* wrong answer 2:
          此处与 leetcode 运行结果不一致
          ["MyCircularQueue","enQueue","rear","enQueue","deQueue",
          "front","deQueue","deQueue","isEmpty","deQueue","enQueue","enQueue"]
          [[2],[4],[],[9],[],
          [],[],[],[],[],[6],[4]]
          返回 4, 需求为 9
          需要删除的 first 而不是 first.prev
         */
        /*
        ["MyCircularQueue","enQueue","front","enQueue","rear","enQueue","enQueue",
                "rear","deQueue","front","deQueue","front"]
        [[7],[0],[],[4],[],[6],[3],
                [],[],[],[],[]]
         */
        CircularQueueDoubleLinked circularQueue = new CircularQueueDoubleLinked(81);
        boolean flag = circularQueue.enQueue(69);
        int rear = circularQueue.rear();
        int front = circularQueue.front();
        boolean isEmpty = circularQueue.isEmpty();
        boolean isFull = circularQueue.isFull();
        boolean deQueue = circularQueue.deQueue();
        System.out.println(front + "," + rear + "," + flag + "," + isEmpty + "," + isFull + "," + deQueue);
    }
}
