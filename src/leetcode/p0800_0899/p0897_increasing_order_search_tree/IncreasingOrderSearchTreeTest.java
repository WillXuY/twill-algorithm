package org.willxu.algorithm.service.treenode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.IncreasingOrderSearchTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IncreasingOrderSearchTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5,
                                3, 6,
                                2, 4, null, 8,
                                1, null, null, null, 7, 9
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                1, null, 2, null, 3, null, 4, null,
                                5, null, 6, null, 7, null, 8, null, 9
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5, 1, 7
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                1, null, 5, null, 7
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, TreeNode expected)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String except = objectMapper.writeValueAsString(expected);
        IncreasingOrderSearchTree recursive =
                new IncreasingOrderSearchTreeRecursive();
        assertEquals(except,
                objectMapper.writeValueAsString(recursive.increasingBST(root)));
    }
}
