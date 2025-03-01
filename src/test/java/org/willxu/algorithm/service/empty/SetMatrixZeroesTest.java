package org.willxu.algorithm.service.empty;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.empty.SetMatrixZeroesSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SetMatrixZeroesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {1, 1, 1},
                                {1, 0, 1},
                                {1, 1, 1}
                        },
                        new int[][] {
                                {1, 0, 1},
                                {0, 0, 0},
                                {1, 0, 1}
                        }
                ),
                arguments(
                        new int[][] {
                                {0, 1, 2, 0},
                                {3, 4, 5, 2},
                                {1, 3, 1, 5}
                        },
                        new int[][] {
                                {0, 0, 0, 0},
                                {0, 4, 5, 0},
                                {0, 3, 1, 0}
                        }
                )
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[][] matrix, int[][] expected) {
        SetMatrixZeroes set = new SetMatrixZeroesSet();
        set.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }
}
