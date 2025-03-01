package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.RelativeSortArrayInsert;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RelativeSortArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                        new int[] {2, 1, 4, 3, 9, 6},
                        new int[] {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19}
                ),
                arguments(
                        new int[] {28, 6, 22, 8, 44, 17},
                        new int[] {22, 28, 8, 6},
                        new int[] {22, 28, 8, 6, 17, 44}
                )
        );
    }

    @ParameterizedTest(name = "Insert {index}")
    @MethodSource("dataProvider")
    public void testInsert(int[] arr1, int[] arr2, int[] expected) {
        RelativeSortArray insert = new RelativeSortArrayInsert();
        assertArrayEquals(expected, insert.relativeSortArray(arr1, arr2));
    }
}
