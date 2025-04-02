package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.MaximumNumberOfPairsInArrayCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumNumberOfPairsInArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 3, 2, 1, 3, 2, 2}, new int[] {3, 1}),
                arguments(new int[] {1, 1}, new int[] {1, 0}),
                arguments(new int[] {0}, new int[] {0, 1})
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int[] expected) {
        MaximumNumberOfPairsInArray count =
                new MaximumNumberOfPairsInArrayCount();
        assertArrayEquals(expected, count.numberOfPairs(nums));
    }
}
