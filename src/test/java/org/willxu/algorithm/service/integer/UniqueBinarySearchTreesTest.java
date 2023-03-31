package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.UniqueBinarySearchTreesRecursive;

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
    public void testRecursive(int n, int excepted) {
        UniqueBinarySearchTrees recursive =
                new UniqueBinarySearchTreesRecursive();
        assertEquals(excepted, recursive.numTrees(n));
    }
}
