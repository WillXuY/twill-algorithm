package org.willxu.algorithm.service.empty;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.empty.ReorderListList;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorderListTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 3, 4
                        }),
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 4, 2, 3
                        })
                ),
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 3, 4, 5
                        }),
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 5, 2, 4, 3
                        })
                )
        );
    }

    @ParameterizedTest(name = "List {index}")
    @MethodSource("dataProvider")
    public void testList(ListNode head, ListNode excepted) {
        ReorderList list = new ReorderListList();
        list.reorderList(head);
        assertEquals(excepted, head);
    }
}
