package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.ApplyOperationsToAnArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ApplyOperationsToAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 2, 2, 1, 1, 0},
                        new int[] {1, 4, 2, 0, 0, 0}
                ),
                arguments(new int[] {0, 1}, new int[] {1, 0})
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int[] expected) {
        ApplyOperationsToAnArray loop = new ApplyOperationsToAnArrayLoop();
        assertArrayEquals(expected, loop.applyOperations(nums));
    }
}
