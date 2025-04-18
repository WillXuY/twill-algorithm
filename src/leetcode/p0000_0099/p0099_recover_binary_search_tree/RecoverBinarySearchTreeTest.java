package leetcode.p0000_0099.p0099_recover_binary_search_tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RecoverBinarySearchTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 3, 1
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                2, 1, 3
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 3, null, null, 2
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                3, 1, null, null, 2
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                3, 1, 4, null, null, 2
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                2, 1, 4, null, null, 3
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, TreeNode expected) {
        RecoverBinarySearchTree recursive =
                new RecoverBinarySearchTreeRecursive();
        recursive.recoverTree(root);
        assertEquals(expected, root);
    }
}
