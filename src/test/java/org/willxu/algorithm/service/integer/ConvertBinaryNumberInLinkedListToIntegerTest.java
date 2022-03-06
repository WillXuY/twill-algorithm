package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.integer.ConvertBinaryNumberInLinkedListToIntegerRecursive;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ConvertBinaryNumberInLinkedListToIntegerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {1, 0, 1}),
                        5
                ),
                arguments(ListNode.getListNodeFromIntArray(new int[] {0}), 0)
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(ListNode head, int excepted) {
        ConvertBinaryNumberInLinkedListToInteger recursive
                = new ConvertBinaryNumberInLinkedListToIntegerRecursive();
        assertEquals(excepted, recursive.getDecimalValue(head));
    }
}
