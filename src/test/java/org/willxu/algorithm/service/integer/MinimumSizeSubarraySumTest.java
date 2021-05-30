package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumSizeSubarraySumBetterImpl;
import org.willxu.algorithm.service.impl.integer.MinimumSizeSubarraySumServiceImpl;
import org.willxu.algorithm.service.integer.MinimumSizeSubarraySumService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumSizeSubarraySumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(7, new int[] {2, 3, 1, 2, 4, 3}, 2),
                arguments(4, new int[] {1, 4, 4}, 1),
                arguments(11, new int[] {1, 1, 1, 1, 1, 1, 1, 1}, 0)
        );

    }

    @ParameterizedTest(name = "brute force {index}")
    @MethodSource("dataProvider")
    public void testGetMinimumSizeSubarraySumBruteForce(int target, int[] nums, int output) {
        MinimumSizeSubarraySumService bruteForce = new MinimumSizeSubarraySumServiceImpl();
        assertEquals(output, bruteForce.getMinimumSizeSubarraySum(target, nums));
    }

    @ParameterizedTest(name = "better {index}")
    @MethodSource("dataProvider")
    public void testGetMinimumSizeSubarraySumBetter(int target, int[] nums, int output) {
        MinimumSizeSubarraySumService better = new MinimumSizeSubarraySumBetterImpl();
        assertEquals(output, better.getMinimumSizeSubarraySum(target, nums));
    }
}
