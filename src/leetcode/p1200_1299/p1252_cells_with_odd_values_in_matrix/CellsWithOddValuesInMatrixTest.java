package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CellsWithOddValuesInMatrixLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CellsWithOddValuesInMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(2, 3, new int[][] {{0, 1}, {1, 1}}, 6),
                arguments(2, 2, new int[][] {{1, 1}, {0, 0}}, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int m, int n, int[][] indices, int expected) {
        CellsWithOddValuesInMatrix loop = new CellsWithOddValuesInMatrixLoop();
        assertEquals(expected, loop.oddCells(m, n, indices));
    }
}
