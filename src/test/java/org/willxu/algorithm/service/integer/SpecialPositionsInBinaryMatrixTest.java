package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SpecialPositionsInBinaryMatrixLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SpecialPositionsInBinaryMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. subtract the added special positions.
                arguments(
                        new int[][] {
                                {0, 0, 0, 1},
                                {1, 0, 0, 0},
                                {0, 1, 1, 0},
                                {0, 0, 0, 0}
                        },
                        2
                ),
                arguments(new int[][] {{1, 0, 0}, {0, 0, 1}, {1, 0, 0}}, 1),
                arguments(new int[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, 3)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] mat, int expected) {
        SpecialPositionsInBinaryMatrix loop =
                new SpecialPositionsInBinaryMatrixLoop();
        assertEquals(expected, loop.numSpecial(mat));
    }
}
