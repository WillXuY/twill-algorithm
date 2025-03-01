package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.intlist.PathSumIiCount;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathSumIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                -2,
                                null, -3
                        ).collect(Collectors.toList())),
                        -5,
                        Stream.of(
                                Stream.of(
                                        -2, -3
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5,
                                4,             8,
                                11, null,      13,      4,
                                7, 2,       null, null, 5, 1
                        ).collect(Collectors.toList())),
                        22,
                        Stream.of(
                                Stream.of(
                                        5, 4, 11, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        5, 8, 4, 5
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1,
                                2, 3
                        ).collect(Collectors.toList())),
                        5,
                        Collections.emptyList()
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1,
                                2
                        ).collect(Collectors.toList())),
                        0,
                        Collections.emptyList()
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(TreeNode root, int targetSum,
                          List<List<Integer>> expected) {
        PathSumIi count = new PathSumIiCount();
        assertEquals(expected, count.pathSum(root, targetSum));
    }
}
