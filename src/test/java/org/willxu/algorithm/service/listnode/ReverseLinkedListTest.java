package org.willxu.algorithm.service.listnode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.ReverseLinkedListIterator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.ListNode.getListNodeFromIntArray;

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
    public void testIterator(ListNode input, ListNode excepted) throws JsonProcessingException {
        ReverseLinkedList iterator = new ReverseLinkedListIterator();
        ObjectMapper objectMapper = new ObjectMapper();
        String except = objectMapper.writeValueAsString(excepted);
        ListNode output = iterator.reverseList(input);
        assertEquals(except, objectMapper.writeValueAsString(output));
    }
}
