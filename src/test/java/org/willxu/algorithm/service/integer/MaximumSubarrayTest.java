package org.example.example.service.integer;

import org.example.example.service.impl.integer.MaximumSubarrayBruteForce;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumSubarrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Explanation: [4, -1, 2, 1] has the largest sum = 6.
                arguments(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
                arguments(new int[] {1}, 1),
                arguments(new int[] {5, 4, -1, 7, 8}, 23)
        );
    }

    @ParameterizedTest(name = "Error param {index}")
    @MethodSource("dataProvider")
    public void testMaximumSubarray(int[] nums, int output) {
        MaximumSubarray bruteForce = new MaximumSubarrayBruteForce();
        assertEquals(output, bruteForce.maxSubArray(nums));
    }
}
