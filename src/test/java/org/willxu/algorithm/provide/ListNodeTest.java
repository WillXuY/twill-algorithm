package org.willxu.algorithm.provide;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.ListNode.getCycleLinkedList;
import static org.willxu.algorithm.provide.ListNode.getListNodeFromIntArray;

public class ListNodeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 1, 2}, 3),
                arguments(new int[] {1, 1, 2, 3, 3}, 5)
        );
    }

    @ParameterizedTest(name = "ListNodeTest {index}")
    @MethodSource("dataProvider")
    public void testListNode(int[] origin, int length) {
        ListNode listNode = getListNodeFromIntArray(origin);
        int[] output = listNode.toIntArray();
        assertArrayEquals(origin, output);
        assertEquals(length, output.length);
    }

    static Stream<Arguments> cycleLinkedListProvider() {
        return Stream.of(
                arguments(new int[] {3, 2, 0, -4}, 1),
                arguments(new int[] {1, 2}, 0),
                arguments(new int[] {1}, -1)
        );
    }

    /**
     * Run this will cause StackOverflowError, but it is right.
     *
     * @param head
     * @param pos
     * @throws JsonProcessingException
     */
    @ParameterizedTest(name = "GetCycleLinkedList {index}")
    @MethodSource("cycleLinkedListProvider")
    public void testGetCycleLinkedList(int[] head, int pos)
            throws JsonProcessingException {
        ListNode listNode = getCycleLinkedList(head, pos);
        ObjectMapper mapper = new ObjectMapper();
        String list = mapper.writeValueAsString(listNode);
        System.out.println(list);
    }
}
