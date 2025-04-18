package leetcode.p0000_0099.p0096_unique_binary_search_trees;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UniqueBinarySearchTreesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(3, 5),
                arguments(1, 1)
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int n, int expected) {
        UniqueBinarySearchTrees recursive =
                new UniqueBinarySearchTreesRecursive();
        assertEquals(expected, recursive.numTrees(n));
    }
}
