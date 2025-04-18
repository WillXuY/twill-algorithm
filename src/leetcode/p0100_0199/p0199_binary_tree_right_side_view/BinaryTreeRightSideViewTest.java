package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.intlist.BinaryTreeRightSideViewLevel;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeRightSideViewTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3, null, 5, null, 4
                        ).collect(Collectors.toList())),
                        Stream.of(
                                1, 3, 4
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, null, 3
                        ).collect(Collectors.toList())),
                        Stream.of(
                                1, 3
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Collections.emptyList()),
                        Collections.emptyList()
                )
        );
    }

    @ParameterizedTest(name = "Level {index}")
    @MethodSource("dataProvider")
    public void testLevel(TreeNode root, List<Integer> expected) {
        BinaryTreeRightSideView level = new BinaryTreeRightSideViewLevel();
        assertEquals(expected, level.rightSideView(root));
    }
}
