package org.willxu.algorithm.service.other;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.other.MergeTwoSortedListsBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MergeTwoSortedListsTest {
    static ListNode getNode(int[] input) {
        if (input == null || input.length == 0) {
            return new ListNode();
        } else if (input.length == 1) {
            return new ListNode(input[0]);
        }
        ListNode thisNode = new ListNode(input[input.length - 1]);
        for (int i = input.length - 2; i >= 0; i--) {
            thisNode = new ListNode(input[i], thisNode);
        }
        return thisNode;
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        getNode(new int[] {1, 2, 4}),
                        getNode(new int[] {1, 3, 4}),
                        getNode(new int[] {1, 1, 2, 3, 4, 4})
                ),
                arguments(
                        // leetcode [] means input and output is null
                        null,
                        null,
                        null
                ),
                arguments(
                        null,
                        getNode(new int[] {0}),
                        getNode(new int[] {0})
                )
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testMergeTwoLists(ListNode l1, ListNode l2, ListNode output) {
        MergeTwoSortedLists bruteForce = new MergeTwoSortedListsBruteForce();
        ListNode result = bruteForce.mergeTwoLists(l1, l2);
        // TODO: deal with the assert of ListNode
        assertEquals(output, result);
    }
}
