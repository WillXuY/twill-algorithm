package org.willxu.algorithm.domain;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.queue.CircularQueueSingleLinked;
import org.willxu.algorithm.domain.impl.queue.CircularQueueDoubleLinked;
import org.willxu.algorithm.domain.queue.AbstractCircularQueue;

public class DesignCircularQueueTest {
    /**
     * 优化 testCircularQueueDoubleLinked()
     */
    @Test
    public void testCircularQueueSingleLinked() {
        AbstractCircularQueue single = new CircularQueueSingleLinked(81);
        boolean flag = single.enQueue(69);
        boolean deQueue = single.deQueue();
        int front = single.front();
        int rear = single.rear();
        boolean isEmpty =  single.isEmpty();
        boolean isFull = single.isFull();
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
        AbstractCircularQueue d = new CircularQueueDoubleLinked(81);
        boolean flag = d.enQueue(69);
        int rear = d.rear();
        int front = d.front();
        boolean isEmpty = d.isEmpty();
        boolean isFull = d.isFull();
        boolean deQueue = d.deQueue();
        System.out.println(front + "," + rear + "," + flag + "," + isEmpty + "," + isFull + "," + deQueue);
    }
}
