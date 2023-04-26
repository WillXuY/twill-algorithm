package org.willxu.algorithm.service.listnode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.LinkedListCycleIiList;

import java.util.stream.Stream;

public class LinkedListCycleIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                3, 2, 0, -4
                        }),
                        1
                ),
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2
                        }),
                        0
                ),
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1
                        }),
                        -1
                )
        );
    }

    @Test
    public void testList(ListNode head, ListNode excepted) {
        // todo check loop linked node.
        LinkedListCycleIi list = new LinkedListCycleIiList();
        ListNode output = list.detectCycle(head);
    }
}
