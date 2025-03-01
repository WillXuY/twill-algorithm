package org.willxu.algorithm.service.treenode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.FindDuplicateSubtreesRecursive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDuplicateSubtreesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1,
                                2, 3,
                                4, null, 2, 4,
                                null, null, 4
                        ).collect(Collectors.toList())),
                        Stream.of(
                                TreeNode.initByListLevel(Stream.of(
                                        2, 4
                                ).collect(Collectors.toList())),
                                TreeNode.initByListLevel(Stream.of(
                                        4
                                ).collect(Collectors.toList()))
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2,
                                1, 1
                        ).collect(Collectors.toList())),
                        Stream.of(
                                TreeNode.initByListLevel(Stream.of(
                                        1
                                ).collect(Collectors.toList()))
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2,
                                2, 2,
                                3, null, 3, null
                        ).collect(Collectors.toList())),
                        Stream.of(
                                TreeNode.initByListLevel(Stream.of(
                                        2, 3
                                ).collect(Collectors.toList())),
                                TreeNode.initByListLevel(Stream.of(
                                        3
                                ).collect(Collectors.toList()))
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                37,
                                -34,          -48,
                                null, -100, -100,          48,
                                null, null, null, null, -54, null,
                                                      -71, -22,
                                               null, null, null, 8

                        ).collect(Collectors.toList())),
                        Stream.of(
                                TreeNode.initByListLevel(Stream.of(
                                        -100
                                ).collect(Collectors.toList()))
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, List<TreeNode> expected) {
        FindDuplicateSubtrees recursive = new FindDuplicateSubtreesRecursive();
        assertEquals(expected, recursive.findDuplicateSubtrees(root));
    }
}
