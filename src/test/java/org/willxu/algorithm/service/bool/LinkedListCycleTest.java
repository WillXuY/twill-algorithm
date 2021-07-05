package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.bool.LinkedListCycleIterator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.ListNode.getCycleLinkedList;

public class LinkedListCycleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                Explanation: There is a cycle in the linked list, where
                the tail connects to the 1st node (0-indexed).
                 */
                arguments(
                        getCycleLinkedList(
                                new int[] {3, 2, 0, -4}, 1
                        ),
                        true
                ),
                /*
                Explanation: There is a cycle in the linked list, where
                the tail connects to the 0th node.
                 */
                arguments(
                        getCycleLinkedList(
                                new int[] {1, 2}, 0
                        ),
                        true
                ),
                /*
                Explanation: There is no cycle in the linked list.
                 */
                arguments(
                        getCycleLinkedList(
                                new int[] {1}, -1
                        ),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Iterator {index}")
    @MethodSource("dataProvider")
    public void testIterator(ListNode head, boolean excepted) {
        LinkedListCycle iterator = new LinkedListCycleIterator();
        assertEquals(excepted, iterator.hasCycle(head));
    }
}
