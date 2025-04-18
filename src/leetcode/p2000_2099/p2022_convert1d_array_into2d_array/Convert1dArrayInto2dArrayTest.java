package org.willxu.algorithm.service.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.matrix.Convert1dArrayInto2dArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Convert1dArrayInto2dArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 2, 3, 4}, 2, 2,
                        new int[][] {{1, 2}, {3, 4}}
                ),
                arguments(new int[] {1, 2, 3}, 1, 3, new int[][] {{1, 2, 3}}),
                arguments(new int[] {1, 2}, 1, 1, new int[][] {})
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop (int[] original, int m, int n, int[][] expected) {
        Convert1dArrayInto2dArray loop = new Convert1dArrayInto2dArrayLoop();
        assertArrayEquals(expected, loop.construct2DArray(original, m, n));
    }
}
