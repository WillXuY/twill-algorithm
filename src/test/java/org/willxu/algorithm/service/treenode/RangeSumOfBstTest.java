package org.willxu.algorithm.service.treenode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.RangeSumOfBstRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RangeSumOfBstTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                10, 5, 15, 3, 7, null, 18
                        ).collect(Collectors.toList())),
                        7, 15, 32
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                10, 5, 15, 3, 7, 13, 18, 1, null, 6
                        ).collect(Collectors.toList())),
                        6, 10, 23
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, int low, int high, int excepted) {
        RangeSumOfBst recursive = new RangeSumOfBstRecursive();
        assertEquals(excepted, recursive.rangeSumBST(root, low, high));
    }
}
