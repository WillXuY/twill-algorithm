package leetcode.p0500_0599.p0515_find_largest_value_in_each_tree_row;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindLargestValueInEachTreeRowTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 3, 2, 5, 3, null, 9
                        ).collect(Collectors.toList())),
                        Stream.of(
                                1, 3, 9
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3
                        ).collect(Collectors.toList())),
                        Stream.of(
                                1, 3
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, List<Integer> expected) {
        FindLargestValueInEachTreeRow recursive =
                new FindLargestValueInEachTreeRowRecursive();
        assertEquals(expected, recursive.largestValues(root));
    }
}
