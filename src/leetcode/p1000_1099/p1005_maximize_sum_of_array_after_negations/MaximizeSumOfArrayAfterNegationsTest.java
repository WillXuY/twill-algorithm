package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximizeSumOfArrayAfterNegationsOrder;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximizeSumOfArrayAfterNegationsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 2. Compare negative map's key with min non-negative.
                arguments(new int[] {-8, 3, -5, -3, -5, -2}, 6, 22),
                // 1. Forget update negative map's value.
                arguments(new int[] {-2, 5, 0, 2, -2}, 3, 11),
                arguments(new int[] {4, 2, 3}, 1, 5),
                arguments(new int[] {3, -1, 0, 2}, 3, 6),
                arguments(new int[] {2, -3, -1, 5, -4}, 2, 13)
        );
    }

    @ParameterizedTest(name = "Order {index}")
    @MethodSource("dataProvider")
    public void testOrder(int[] nums, int k, int expected) {
        MaximizeSumOfArrayAfterNegations order =
                new MaximizeSumOfArrayAfterNegationsOrder();
        assertEquals(expected, order.largestSumAfterKNegations(nums, k));
    }
}
