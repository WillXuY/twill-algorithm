package org.willxu.algorithm.service.treenode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.FindCorrespondingNodeOfBinaryTreeInCloneOfThatTreeRecursive;
import org.willxu.algorithm.service.treenode.FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindCorrespondingNodeOfBinaryTreeInCloneOfThatTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initMainAndSubTreeByListLevelAndValue(
                                Stream.of(
                                        7, 4, 3, null, null, 6, 19
                                ).collect(Collectors.toList()),
                                3
                        ),
                        TreeNode.initMainAndSubTreeByListLevelAndValue(
                                Stream.of(
                                        7, 4, 3, null, null, 6, 19
                                ).collect(Collectors.toList()),
                                3
                        )
                ),
                arguments(
                        TreeNode.initMainAndSubTreeByListLevelAndValue(
                                Stream.of(7).collect(Collectors.toList()),
                                7
                        ),
                        TreeNode.initMainAndSubTreeByListLevelAndValue(
                                Stream.of(7).collect(Collectors.toList()),
                                7
                        )
                ),
                arguments(
                        TreeNode.initMainAndSubTreeByListLevelAndValue(
                                Stream.of(
                                        8, null, 6, null, 5, null, 4, null, 3,
                                        null, 2, null, 1
                                ).collect(Collectors.toList()),
                                4
                        ),
                        TreeNode.initMainAndSubTreeByListLevelAndValue(
                                Stream.of(
                                        8, null, 6, null, 5, null, 4, null, 3,
                                        null, 2, null, 1
                                ).collect(Collectors.toList()),
                                4
                        )
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(
            List<TreeNode> originalList, List<TreeNode> clonedList) {
        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree recursive =
                new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTreeRecursive();
        assertEquals(clonedList.get(1), recursive.getTargetCopy(
                originalList.get(0), clonedList.get(0), originalList.get(1)));
    }
}
