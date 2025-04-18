package leetcode.p0100_0199.p0129_sum_root_to_leaf_numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumRootToLeafNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3
                        ).collect(Collectors.toList())),
                        25
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                4, 9, 0, 5, 1
                        ).collect(Collectors.toList())),
                        1026
                )
        );
    }

    @ParameterizedTest(name = "Level {index}")
    @MethodSource("dataProvider")
    public void testLevel(TreeNode root, int expected) {
        SumRootToLeafNumbers level = new SumRootToLeafNumbersLevel();
        assertEquals(expected, level.sumNumbers(root));
    }
}
