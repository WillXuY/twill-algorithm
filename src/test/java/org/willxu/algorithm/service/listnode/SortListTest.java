package org.willxu.algorithm.service.listnode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.SortListMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortListTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                4, 2, 1, 3
                        }),
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 3, 4
                        })
                ),
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                -1, 5, 3, 4, 0
                        }),
                        ListNode.getListNodeFromIntArray(new int[] {
                                -1, 0, 3, 4, 5
                        })
                ),
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {}),
                        ListNode.getListNodeFromIntArray(new int[] {})
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(ListNode head, ListNode expected) {
        SortList map = new SortListMap();
        assertEquals(expected, map.sortList(head));
    }
}
