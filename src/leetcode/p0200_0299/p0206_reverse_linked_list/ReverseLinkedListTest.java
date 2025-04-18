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
import org.willxu.algorithm.service.impl.listnode.ReverseLinkedListIterator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static common.provide.ListNode.getListNodeFromIntArray;

public class ReverseLinkedListTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        getListNodeFromIntArray(new int[] {
                                1, 2, 3, 4, 5
                        }), getListNodeFromIntArray(new int[] {
                                5, 4, 3, 2, 1
                        })
                ),
                arguments(
                        getListNodeFromIntArray(new int[] {
                                1, 2
                        }), getListNodeFromIntArray(new int[] {
                                2, 1
                        })
                ),
                arguments(
                        getListNodeFromIntArray(new int[0]),
                        getListNodeFromIntArray(new int[0])
                )
        );
    }

    @ParameterizedTest(name = "Iterator {index}")
    @MethodSource("dataProvider")
    public void testIterator(ListNode input, ListNode expected) throws JsonProcessingException {
        ReverseLinkedList iterator = new ReverseLinkedListIterator();
        ObjectMapper objectMapper = new ObjectMapper();
        String except = objectMapper.writeValueAsString(expected);
        ListNode output = iterator.reverseList(input);
        assertEquals(except, objectMapper.writeValueAsString(output));
    }
}
