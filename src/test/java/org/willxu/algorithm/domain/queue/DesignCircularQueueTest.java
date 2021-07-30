package org.willxu.algorithm.domain.queue;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.queue.CircularQueueSingleLinked;
import org.willxu.algorithm.domain.impl.queue.CircularQueueDoubleLinked;
import org.willxu.algorithm.domain.queue.AbstractCircularQueue;

import static org.junit.jupiter.api.Assertions.*;

public class DesignCircularQueueTest {
    /**
     * leetcode test example 1
     */
    private static final int MAX_SIZE_1 = 3;

    /**
     * leetcode wrong answer example
     */
    private static final int MAX_SIZE_2 = 2;

    /**
     * leetcode default test
     */
    @Test
    public void testAllCircularQueue() {
        AbstractCircularQueue s = new CircularQueueSingleLinked(MAX_SIZE_1);
        testCircularQueue(s);
        AbstractCircularQueue d = new CircularQueueDoubleLinked(MAX_SIZE_1);
        testCircularQueue(d);
        AbstractCircularQueue s2 = new CircularQueueSingleLinked(MAX_SIZE_2);
        testWrongAnswer2(s2);
        AbstractCircularQueue d2 = new CircularQueueDoubleLinked(MAX_SIZE_2);
        testWrongAnswer2(d2);
    }

    /**
     * leetcode default test
     */
    public void testCircularQueue(AbstractCircularQueue circularQueue) {
        int addFirst = 1;
        assertTrue(circularQueue.enQueue(addFirst));
        int addSecond = 2;
        assertTrue(circularQueue.enQueue(addSecond));
        int addThird = 3;
        assertTrue(circularQueue.enQueue(addThird));
        int addFourth = 4;
        assertFalse(circularQueue.enQueue(addFourth));
        int rearAfterAddFourth = 3;
        assertEquals(rearAfterAddFourth, circularQueue.rear());
        assertTrue(circularQueue.isFull());
        assertTrue(circularQueue.deQueue());
        int addFifth = 4;
        assertTrue(circularQueue.enQueue(addFifth));
        int rearAfterAddFifth = 4;
        assertEquals(rearAfterAddFifth, circularQueue.rear());
    }

    /**
     * wrong answer 2:
     * 此处与 leetcode 运行结果不一致
     * ["MyCircularQueue","enQueue","rear","enQueue","deQueue",
     * "front","deQueue","deQueue","isEmpty","deQueue","enQueue","enQueue"]
     * [[2],[4],[],[9],[],
     * [],[],[],[],[],[6],[4]]
     * 返回 4, 需求为 9
     * 需要删除的 first 而不是 first.prev
     */
    public void testWrongAnswer2(AbstractCircularQueue circularQueue) {
        int addFirst = 4;
        assertTrue(circularQueue.enQueue(addFirst));
        assertEquals(addFirst, circularQueue.rear());
        int addSecond = 9;
        assertTrue(circularQueue.enQueue(addSecond));
        assertTrue(circularQueue.deQueue());
        assertEquals(addSecond, circularQueue.front());
        assertTrue(circularQueue.deQueue());
        assertFalse(circularQueue.deQueue());
        assertTrue(circularQueue.isEmpty());
        assertFalse(circularQueue.deQueue());
        int addThird = 6;
        assertTrue(circularQueue.enQueue(addThird));
        int addFourth = 4;
        assertTrue(circularQueue.enQueue(addFourth));
    }
}
