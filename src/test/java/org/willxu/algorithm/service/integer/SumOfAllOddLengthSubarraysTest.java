package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SumOfAllOddLengthSubarraysCalculate;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SumOfAllOddLengthSubarraysTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {6, 9, 14, 5, 3, 8, 7, 12, 13, 1}, 878),
                arguments(new int[] {1}, 1),
                arguments(new int[] {7, 6, 8, 6}, 68),
                arguments(new int[] {1, 4, 2, 5, 3}, 58),
                arguments(new int[] {1, 2}, 3),
                arguments(new int[] {10, 11, 12}, 66)
        );
    }

    @ParameterizedTest(name = "Calculate {index}")
    @MethodSource("dataProvider")
    public void testCalculate(int[] arr, int excepted) {
        SumOfAllOddLengthSubarrays calculate =
                new SumOfAllOddLengthSubarraysCalculate();
        assertEquals(excepted, calculate.sumOddLengthSubarrays(arr));
    }
}
