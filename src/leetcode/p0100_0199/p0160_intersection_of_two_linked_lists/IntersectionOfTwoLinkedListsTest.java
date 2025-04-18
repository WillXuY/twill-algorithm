/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.listnode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.IntersectionOfTwoLinkedListsSaveNodes;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static common.provide.ListNode.getIntersectLinkedLists;

public class IntersectionOfTwoLinkedListsTest {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static Stream<Arguments> saveNodesDataProvider() {
        return Stream.of(
                /*
                Example 1:

                4 -> 1 -> 8 -> 4 -> 5
                          ^
                          |
                5 -> 6 -> 1

                Input: intersectVal = 8, listA = [4, 1, 8, 4, 5],
                listB = [5, 6, 1, 8, 4, 5], skipA = 2, skipB = 3

                Output: Intersected at '8'

                Explanation: The intersected node's value is 8 (note
                that this must not be 0 if teh two lists intersect).
                From the head of A, it reads as [4, 1, 8, 4, 5]. From
                the head of B, it reads as [5, 6, 1, 8, 4, 5]. There
                are 2 nodes before the intersected node in A; There are
                3 nodes before the intersected node in B.
                 */
                arguments(getIntersectLinkedLists(
                        new int[] {4, 1, 8, 4, 5},
                        new int[] {5, 6, 1, 8, 4, 5},
                        8, 2, 3
                )),
                /*
                A: 1 -> 9 -> 1 -> 2 -> 4
                                  ^
                                  |
                B:                3
                 */
                arguments(getIntersectLinkedLists(
                        new int[] {1, 9, 1, 2, 4},
                        new int[] {3, 2, 4},
                        2, 3, 1
                )),
                arguments(getIntersectLinkedLists(
                        new int[] {2, 6, 4},
                        new int[] {1, 5},
                        0, 3, 2
                ))
        );
    }

    @ParameterizedTest(name = "Save nodes {index}")
    @MethodSource("saveNodesDataProvider")
    public void testSaveNodes(List<ListNode> params)
            throws JsonProcessingException {
        IntersectionOfTwoLinkedLists saveNodes =
                new IntersectionOfTwoLinkedListsSaveNodes();
        String output = OBJECT_MAPPER.writeValueAsString(
                saveNodes.getIntersectionNode(params.get(0), params.get(1)));
        ListNode expected = params.size() > 2 ? params.get(2) : null;
        assertEquals(OBJECT_MAPPER.writeValueAsString(expected), output);
    }
}
