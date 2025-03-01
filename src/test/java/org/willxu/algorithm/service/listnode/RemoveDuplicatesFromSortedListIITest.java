package org.willxu.algorithm.service.listnode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.RemoveDuplicatesFromSortedListIiLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveDuplicatesFromSortedListIITest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 3, 3, 4, 4, 5
                        }),
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 5
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 1, 1, 2, 3
                        }),
                        ListNode.getListNodeFromIntArray(new int[] {
                                2, 3
                        })
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(ListNode head, ListNode expected) {
        RemoveDuplicatesFromSortedListIi loop =
                new RemoveDuplicatesFromSortedListIiLoop();
        ListNode output = loop.deleteDuplicates(head);
        if (expected == null) {
            assertNull(output);
        } else {
            assertArrayEquals(expected.toIntArray(), output.toIntArray());
        }
    }
}
