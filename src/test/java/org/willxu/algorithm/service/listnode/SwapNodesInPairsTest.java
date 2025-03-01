package org.willxu.algorithm.service.listnode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.SwapNodesInPairsPointer;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SwapNodesInPairsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 3, 4
                        }),
                        ListNode.getListNodeFromIntArray(new int[] {
                                2, 1, 4, 3
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {}),
                        ListNode.getListNodeFromIntArray(new int[] {})
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {1, 2, 3}),
                        ListNode.getListNodeFromIntArray(new int[] {2, 1, 3})
                )
        );
    }

    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(ListNode head, ListNode expected) {
        SwapNodesInPairs pointer = new SwapNodesInPairsPointer();
        if (expected == null) {
            assertNull(pointer.swapPairs(head));
            return;
        }
        assertArrayEquals(expected.toIntArray(),
                pointer.swapPairs(head).toIntArray());
    }
}
