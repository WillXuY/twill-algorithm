package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.ints.FindModeInBinarySearchTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindModeInBinarySearchTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 4
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1,0,1,0,0,1,1,0
                        ).collect(Collectors.toList())),
                        new int[] {0, 1}
                ),
                // Wrong answer 3
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                6,2,8,0,4,7,9,null,null,2,6
                        ).collect(Collectors.toList())),
                        new int[] {2, 6}
                ),
                // Wrong answer 2
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 1, 2
                        ).collect(Collectors.toList())),
                        new int[] {2}
                ),
                // Wrong answer 1
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, null, 2
                        ).collect(Collectors.toList())),
                        new int[] {1, 2}
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, null, 2, 2
                        ).collect(Collectors.toList())),
                        new int[] {2}
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                0
                        ).collect(Collectors.toList())),
                        new int[] {0}
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode input, int[] expected) {
        FindModeInBinarySearchTree recursive =
                new FindModeInBinarySearchTreeRecursive();
        assertArrayEquals(expected, recursive.findMode(input));
    }
}
