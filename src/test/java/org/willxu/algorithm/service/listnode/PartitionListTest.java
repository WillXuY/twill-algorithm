package org.willxu.algorithm.service.listnode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.PartitionListSave;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PartitionListTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 4, 3, 2, 5, 2
                        }),
                        3,
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 2, 4, 3, 5
                        })
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                2, 1
                        }),
                        2,
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2
                        })
                )
        );
    }

    @ParameterizedTest(name = "Save {index}")
    @MethodSource("dataProvider")
    public void testSave(ListNode head, int x, ListNode excepted) {
        PartitionList save = new PartitionListSave();
        ListNode output = save.partition(head, x);
        if (excepted == null) {
            assertNull(output);
        } else {
            assertArrayEquals(excepted.toIntArray(), output.toIntArray());
        }
    }
}
