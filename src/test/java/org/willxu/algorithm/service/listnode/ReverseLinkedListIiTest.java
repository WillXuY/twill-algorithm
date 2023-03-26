package org.willxu.algorithm.service.listnode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.ReverseLinkedListIiLoop;

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
                         ListNode excepted) {
        ReverseLinkedListIi loop = new ReverseLinkedListIiLoop();
        assertEquals(excepted, loop.reverseBetween(head, left, right));
    }
}
