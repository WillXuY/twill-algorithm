package leetcode.p1200_1299.p1290_convert_binary_number_in_linked_list_to_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.ListNode;

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
    public void testRecursive(ListNode head, int expected) {
        ConvertBinaryNumberInLinkedListToInteger recursive
                = new ConvertBinaryNumberInLinkedListToIntegerRecursive();
        assertEquals(expected, recursive.getDecimalValue(head));
    }
}
