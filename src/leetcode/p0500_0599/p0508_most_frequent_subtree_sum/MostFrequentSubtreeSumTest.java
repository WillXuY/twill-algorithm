package leetcode.p0500_0599.p0508_most_frequent_subtree_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MostFrequentSubtreeSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5, 2, -3
                        ).collect(Collectors.toList())),
                        new int[] {2, -3, 4}
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5, 2, -5
                        ).collect(Collectors.toList())),
                        new int[] {2}
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(TreeNode root, int[] expected) {
        MostFrequentSubtreeSum map = new MostFrequentSubtreeSumMap();
        assertArrayEquals(expected, map.findFrequentTreeSum(root));
    }
}
