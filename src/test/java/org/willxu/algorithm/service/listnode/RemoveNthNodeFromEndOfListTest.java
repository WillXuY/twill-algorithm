package org.willxu.algorithm.service.listnode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.RemoveNthNodeFromEndOfListLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveNthNodeFromEndOfListTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 3, 4, 5
                        }),
                        2,
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 3, 5
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {1}),
                        1,
                        ListNode.getListNodeFromIntArray(new int[] {})
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {1, 2}),
                        1,
                        ListNode.getListNodeFromIntArray(new int[] {1})
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(ListNode head, int n, ListNode expected) {
        RemoveNthNodeFromEndOfList loop = new RemoveNthNodeFromEndOfListLoop();
        ListNode output = loop.removeNthFromEnd(head, n);
        if (expected == null) {
            assertNull(output);
        } else {
            assertArrayEquals(expected.toIntArray(), output.toIntArray());
        }
    }
}
