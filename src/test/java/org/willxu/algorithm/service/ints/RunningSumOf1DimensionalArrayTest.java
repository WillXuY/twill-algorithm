package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.RunningSumOf1DimensionalArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RunningSumOf1DimensionalArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 4}, new int[] {1, 3, 6, 10}),
                arguments(new int[] {1, 1, 1, 1, 1}, new int[] {1, 2, 3, 4, 5}),
                arguments(
                        new int[] {3, 1, 2, 10, 1},
                        new int[] {3, 4, 6, 16, 17}
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int[] excepted) {
        RunningSumOf1DimensionalArray loop =
                new RunningSumOf1DimensionalArrayLoop();
        assertArrayEquals(excepted, loop.runningSum(nums));
    }
}
