package org.willxu.algorithm.service.listnode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.RotateListPointer;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RotateListTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        ListNode.getListNodeFromIntArray(
                                new int[] {1, 2, 3, 4, 5}
                        ),
                        10,
                        ListNode.getListNodeFromIntArray(
                                new int[] {1, 2, 3, 4, 5}
                        )
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(
                                new int[] {1}
                        ),
                        99,
                        ListNode.getListNodeFromIntArray(
                                new int[] {1}
                        )
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(
                                new int[] {1, 2}
                        ),
                        2,
                        ListNode.getListNodeFromIntArray(
                                new int[] {1, 2}
                        )
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(
                                new int[] {1}
                        ),
                        1,
                        ListNode.getListNodeFromIntArray(
                                new int[] {1}
                        )
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(
                                new int[] {1}
                        ),
                        0,
                        ListNode.getListNodeFromIntArray(
                                new int[] {1}
                        )
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(
                                new int[] {}
                        ),
                        0,
                        ListNode.getListNodeFromIntArray(
                                new int[] {}
                        )
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(
                                new int[] {1, 2, 3, 4, 5}
                        ),
                        2,
                        ListNode.getListNodeFromIntArray(
                                new int[] {4, 5, 1, 2, 3}
                        )
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(
                                new int[] {0, 1, 2}
                        ),
                        4,
                        ListNode.getListNodeFromIntArray(
                                new int[] {2, 0, 1}
                        )
                )
        );
    }

    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(ListNode head, int k, ListNode expected) {
        RotateList pointer = new RotateListPointer();
        ListNode output = pointer.rotateRight(head, k);
        if (expected == null) {
            assertNull(output);
        } else {
            assertArrayEquals(expected.toIntArray(), output.toIntArray());
        }
    }
}
