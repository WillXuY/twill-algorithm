package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.SquaresOfSortedArrayInsert;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SquaresOfSortedArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {-4, -1, 0, 3, 10},
                        new int[] {0, 1, 9, 16, 100}
                ),
                arguments(
                        new int[] {-7, -3, 2, 3, 11},
                        new int[] {4, 9, 9, 49, 121}
                )
        );
    }

    @ParameterizedTest(name = "Insert {index}")
    @MethodSource("dataProvider")
    public void testInsert(int[] nums, int[] expected) {
        SquaresOfSortedArray insert = new SquaresOfSortedArrayInsert();
        assertArrayEquals(expected, insert.sortedSquares(nums));
    }
}
