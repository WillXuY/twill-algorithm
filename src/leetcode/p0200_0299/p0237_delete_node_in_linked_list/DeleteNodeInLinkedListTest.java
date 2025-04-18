/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0237_delete_node_in_linked_list;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DeleteNodeInLinkedListTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                4, 5, 1, 9
                        }),
                        5,
                        ListNode.getListNodeFromIntArray(new int[] {
                                4, 1, 9
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                4, 5, 1, 9
                        }),
                        1,
                        ListNode.getListNodeFromIntArray(new int[] {
                                4, 5, 9
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 3, 4
                        }),
                        3,
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 4
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                0, 1
                        }),
                        0,
                        ListNode.getListNodeFromIntArray(new int[] {
                                1
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                -3, 5, -99
                        }),
                        -3,
                        ListNode.getListNodeFromIntArray(new int[] {
                                5, -99
                        })
                )
        );
    }

    @ParameterizedTest(name = "Point {index}")
    @MethodSource("dataProvider")
    public void testPoint(ListNode head, int nodeVal, ListNode expected)
            throws JsonProcessingException {
        DeleteNodeInLinkedList point = new DeleteNodeInLinkedListPoint();
        ListNode node = getNodeInHead(head, nodeVal);
        point.deleteNode(node);
        ObjectMapper objectMapper = new ObjectMapper();
        String exceptString = objectMapper.writeValueAsString(expected);
        assertEquals(exceptString, objectMapper.writeValueAsString(head));
    }

    private ListNode getNodeInHead(ListNode head, int nodeVal) {
        while (head != null) {
            if (head.val == nodeVal) {
                return head;
            }
            head = head.next;
        }
        throw new RuntimeException("Node not include");
    }
}
