package org.willxu.algorithm.service.treenode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.ListNode;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.ConvertSortedListToBinarySearchTreeList;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertSortedListToBinarySearchTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                -10, -3, 0, 5, 9
                        }),
                        TreeNode.initByListLevel(Stream.of(
                                0, -10, 5, null, -3, null, 9
                        ).collect(Collectors.toList()))
                ),
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {}),
                        TreeNode.initByListLevel(Collections.emptyList())
                )
        );
    }

    @ParameterizedTest(name = "List {index}")
    @MethodSource("dataProvider")
    public void testList(ListNode head, TreeNode expected) {
        ConvertSortedListToBinarySearchTree list =
                new ConvertSortedListToBinarySearchTreeList();
        assertEquals(expected, list.sortedListToBST(head));
    }
}
