package leetcode.p0000_0099.p0095_unique_binary_search_trees_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UniqueBinarySearchTreesIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        3,
                        Stream.of(
                                TreeNode.initByListLevel(Stream.of(
                                        1, null, 2, null, 3
                                ).collect(Collectors.toList())),
                                TreeNode.initByListLevel(Stream.of(
                                        1, null, 3, 2
                                ).collect(Collectors.toList())),
                                TreeNode.initByListLevel(Stream.of(
                                        2, 1, 3
                                ).collect(Collectors.toList())),
                                TreeNode.initByListLevel(Stream.of(
                                        3, 1, null, null, 2
                                ).collect(Collectors.toList())),
                                TreeNode.initByListLevel(Stream.of(
                                        3, 2, null, 1
                                ).collect(Collectors.toList()))
                        ).collect(Collectors.toList())
                ),
                arguments(
                        1,
                        Stream.of(
                                TreeNode.initByListLevel(Stream.of(
                                        1
                                ).collect(Collectors.toList()))
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int n, List<TreeNode> expected) {
        UniqueBinarySearchTreesIi recursive =
                new UniqueBinarySearchTreesIiRecursive();
        assertEquals(expected, recursive.generateTrees(n));
    }
}
