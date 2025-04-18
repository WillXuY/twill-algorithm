package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.integer.CountCompleteTreeNodesList;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCompleteTreeNodesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3, 4, 5, 6
                        ).collect(Collectors.toList())),
                        6
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Collections.emptyList()),
                        0
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1
                        ).collect(Collectors.toList())),
                        1
                )
        );
    }

    @ParameterizedTest(name = "List {index}")
    @MethodSource("dataProvider")
    public void testList(TreeNode root, int expected) {
        CountCompleteTreeNodes list = new CountCompleteTreeNodesList();
        assertEquals(expected, list.countNodes(root));
    }
}
