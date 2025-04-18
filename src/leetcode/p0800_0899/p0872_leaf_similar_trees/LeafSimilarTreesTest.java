package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.bool.LeafSimilarTreesRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LeafSimilarTreesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                3, 5, 1, 6, 2, 9, 8, null, null, 7, 4
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                3, 5, 1, 6, 7, 4, 2,
                                null, null, null, null, null, null, 9, 8
                        ).collect(Collectors.toList())),
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                1
                        ).collect(Collectors.toList())),
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                2
                        ).collect(Collectors.toList())),
                        false
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                2, 2
                        ).collect(Collectors.toList())),
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                1, 3, 2
                        ).collect(Collectors.toList())),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(
            TreeNode root1, TreeNode root2, boolean expected) {
        LeafSimilarTrees recursive = new LeafSimilarTreesRecursive();
        assertEquals(expected, recursive.leafSimilar(root1, root2));
    }
}
