package leetcode.p0100_0199.p0114_flatten_binary_tree_to_linked_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlattenBinaryTreeToLinkedListTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 5, 3, 4, null, 6
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                1, null, 2, null, 3, null, 4, null, 5, null, 6
                        ).collect(Collectors.toList()))
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Collections.emptyList()),
                        TreeNode.initByListLevel(Collections.emptyList())
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                0
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                0
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Stack {index}")
    @MethodSource("dataProvider")
    public void testStack(TreeNode root, TreeNode expected) {
        FlattenBinaryTreeToLinkedList stack =
                new FlattenBinaryTreeToLinkedListStack();
        stack.flatten(root);
        assertEquals(expected, root);
    }
}
