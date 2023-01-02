package org.willxu.algorithm.service.listnode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.AddTwoNumbersLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AddTwoNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 6, 0, 3, 3, 6, 7, 2, 0, 1
                        }),
                        ListNode.getListNodeFromIntArray(new int[] {
                                6, 3, 0, 8, 9, 6, 6, 9, 6, 1
                        }),
                        ListNode.getListNodeFromIntArray(new int[] {
                                7, 9, 0, 1, 3, 3, 4, 2, 7, 2
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {2, 4, 3}),
                        ListNode.getListNodeFromIntArray(new int[] {5, 6, 4}),
                        ListNode.getListNodeFromIntArray(new int[] {7, 0, 8})
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {0}),
                        ListNode.getListNodeFromIntArray(new int[] {0}),
                        ListNode.getListNodeFromIntArray(new int[] {0})
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                9, 9, 9, 9, 9, 9, 9
                        }),
                        ListNode.getListNodeFromIntArray(new int[] {
                                9, 9, 9, 9
                        }),
                        ListNode.getListNodeFromIntArray(new int[] {
                                8, 9, 9, 9, 0, 0, 0, 1
                        })
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(ListNode l1, ListNode l2, ListNode excepted) {
        AddTwoNumbers loop = new AddTwoNumbersLoop();
        int[] output = loop.addTwoNumbers(l1, l2).toIntArray();
        assertArrayEquals(excepted.toIntArray(), output);
    }
}
