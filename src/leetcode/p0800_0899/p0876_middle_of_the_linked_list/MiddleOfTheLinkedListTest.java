package org.willxu.algorithm.service.listnode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.MiddleOfTheLinkedListRecursive;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MiddleOfTheLinkedListTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        ListNode.getListNodeFromIntArray(new int[]{
                                1, 2, 3, 4, 5
                        }),
                        ListNode.getListNodeFromIntArray(new int[]{
                                3, 4, 5
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[]{
                                1, 2, 3, 4, 5, 6
                        }),
                        ListNode.getListNodeFromIntArray(new int[]{
                                4, 5, 6
                        })
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(ListNode head, ListNode expected) {
        MiddleOfTheLinkedList recursive = new MiddleOfTheLinkedListRecursive();
        assertArrayEquals(expected.toIntArray(),
                recursive.middleNode(head).toIntArray());
    }
}
