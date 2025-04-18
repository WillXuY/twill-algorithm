package leetcode.p0000_0099.p0092_reverse_linked_list_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReverseLinkedListIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                3, 5
                        }),
                        1, 1,
                        ListNode.getListNodeFromIntArray(new int[] {
                                5, 3
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                3, 5
                        }),
                        1, 2,
                        ListNode.getListNodeFromIntArray(new int[] {
                                5, 3
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 3, 4, 5, 2, 3, 4, 5
                        }),
                        2, 4,
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 4, 3, 2, 5, 2, 3, 4, 5
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 3, 4, 5
                        }),
                        2, 4,
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 4, 3, 2, 5
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                5
                        }),
                        1, 1,
                        ListNode.getListNodeFromIntArray(new int[] {
                                5
                        })
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(ListNode head, int left, int right,
                         ListNode expected) {
        ReverseLinkedListIi loop = new ReverseLinkedListIiLoop();
        assertEquals(expected, loop.reverseBetween(head, left, right));
    }
}
