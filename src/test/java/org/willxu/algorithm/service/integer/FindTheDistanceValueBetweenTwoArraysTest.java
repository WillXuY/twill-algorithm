package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindTheDistanceValueBetweenTwoArraysLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindTheDistanceValueBetweenTwoArraysTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {4, 5, 8},
                        new int[] {10, 9, 1, 8},
                        2,
                        2
                ),
                arguments(
                        new int[] {1, 4, 2, 3},
                        new int[] {-4, -3, 6, 10, 20, 30},
                        3,
                        2
                ),
                arguments(
                        new int[] {2, 1, 100, 3},
                        new int[] {-5, -2, 10, -3, -7},
                        6,
                        1
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] arr1, int[] arr2, int d, int excepted) {
        FindTheDistanceValueBetweenTwoArrays loop
                = new FindTheDistanceValueBetweenTwoArraysLoop();
        assertEquals(excepted, loop.findTheDistanceValue(arr1, arr2, d));
    }
}
