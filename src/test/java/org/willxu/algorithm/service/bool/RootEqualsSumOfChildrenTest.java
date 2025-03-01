package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.bool.RootEqualsSumOfChildrenAdd;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RootEqualsSumOfChildrenTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                10, 4, 6
                        ).collect(Collectors.toList())),
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5, 3, 1
                        ).collect(Collectors.toList())),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Add {index}")
    @MethodSource("dataProvider")
    public void testAdd(TreeNode root, boolean expected) {
        RootEqualsSumOfChildren add = new RootEqualsSumOfChildrenAdd();
        assertEquals(expected, add.checkTree(root));
    }
}
