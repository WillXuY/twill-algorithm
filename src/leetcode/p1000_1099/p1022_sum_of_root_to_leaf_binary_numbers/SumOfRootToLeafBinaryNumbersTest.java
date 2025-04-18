package leetcode.p1000_1099.p1022_sum_of_root_to_leaf_binary_numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SumOfRootToLeafBinaryNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                    1,
                                  0,   1,
                                0, 1, 0, 1
                        ).collect(Collectors.toList())),
                        22
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                0
                        ).collect(Collectors.toList())),
                        0
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, int expected) {
        SumOfRootToLeafBinaryNumbers recursive =
                new SumOfRootToLeafBinaryNumbersRecursive();
        assertEquals(expected, recursive.sumRootToLeaf(root));
    }
}
