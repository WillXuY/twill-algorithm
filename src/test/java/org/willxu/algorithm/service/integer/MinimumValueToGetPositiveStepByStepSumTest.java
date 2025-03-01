package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumValueToGetPositiveStepByStepSumMin;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumValueToGetPositiveStepByStepSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {-3, 2, -3, 4, 2}, 5),
                arguments(new int[] {1, 2}, 1),
                arguments(new int[] {1, -2, -3}, 5)
        );
    }

    @ParameterizedTest(name = "Min {index}")
    @MethodSource("dataProvider")
    public void testMin(int[] nums, int expected) {
        MinimumValueToGetPositiveStepByStepSum min =
                new MinimumValueToGetPositiveStepByStepSumMin();
        assertEquals(expected, min.minStartValue(nums));
    }
}
