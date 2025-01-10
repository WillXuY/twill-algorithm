package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumAscendingSubarraySumCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumAscendingSubarraySumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {10}, 10),
                arguments(new int[] {10, 20, 30, 5, 10, 50}, 65),
                arguments(new int[] {10, 20, 30, 40, 50}, 150),
                arguments(new int[] {12, 17, 15, 13, 10, 11, 12}, 33)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int excepted) {
        MaximumAscendingSubarraySum count =
                new MaximumAscendingSubarraySumCount();
        assertEquals(excepted, count.maxAscendingSum(nums));
    }
}
