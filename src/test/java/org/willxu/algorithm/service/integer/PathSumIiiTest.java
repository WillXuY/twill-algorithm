package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.integer.PathSumIiiRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathSumIiiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1,
                                2
                        ).collect(Collectors.toList())),
                        2, 1
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                10,
                                5,             -3,
                                3,         2,  null, 11,
                                3, -2, null, 1
                        ).collect(Collectors.toList())),
                        8, 3
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5,
                                4,        8,
                                11, null,  13,         4,
                                7, 2,      null, null, 5, 1
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, int targetSum, int excepted) {
        PathSumIii recursive = new PathSumIiiRecursive();
        assertEquals(excepted, recursive.pathSum(root, targetSum));
    }
}
