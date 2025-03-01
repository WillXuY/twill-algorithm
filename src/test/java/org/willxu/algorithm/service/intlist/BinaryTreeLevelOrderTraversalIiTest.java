package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.intlist.BinaryTreeLevelOrderTraversalIiList;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BinaryTreeLevelOrderTraversalIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                3, 9, 20, null, null, 15, 7
                        ).collect(Collectors.toList())),
                        Stream.of(
                                Stream.of(15, 7).collect(Collectors.toList()),
                                Stream.of(9, 20).collect(Collectors.toList()),
                                Stream.of(3).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1
                        ).collect(Collectors.toList())),
                        Stream.of(
                                Stream.of(1).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        TreeNode.initByListLevel(Collections.emptyList()),
                        Collections.emptyList()
                )
        );
    }

    @ParameterizedTest(name = "List {index}")
    @MethodSource("dataProvider")
    public void testList(TreeNode root, List<List<Integer>> expected) {
        BinaryTreeLevelOrderTraversalIi list =
                new BinaryTreeLevelOrderTraversalIiList();
        assertEquals(expected, list.levelOrderBottom(root));
    }
}
