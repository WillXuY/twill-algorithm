/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0141_linked_list_cycle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static common.provide.ListNode.getCycleLinkedList;

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
    public void testIterator(ListNode head, boolean expected) {
        LinkedListCycle iterator = new LinkedListCycleIterator();
        assertEquals(expected, iterator.hasCycle(head));
    }
}
