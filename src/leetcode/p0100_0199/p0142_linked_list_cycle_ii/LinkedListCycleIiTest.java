package leetcode.p0100_0199.p0142_linked_list_cycle_ii;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import common.provide.ListNode;

import java.util.stream.Stream;

public class LinkedListCycleIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                3, 2, 0, -4
                        }),
                        1
                ),
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2
                        }),
                        0
                ),
                Arguments.arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1
                        }),
                        -1
                )
        );
    }

    @Test
    public void testList(ListNode head, ListNode expected) {
        // todo check loop linked node.
        LinkedListCycleIi list = new LinkedListCycleIiList();
        ListNode output = list.detectCycle(head);
    }
}
