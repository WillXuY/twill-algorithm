package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountOddNumbersInAnIntervalRangeCalculate;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountOddNumbersInAnIntervalRangeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 3. Calculate low and high separately
                arguments(21, 22, 1),
                arguments(14, 17, 2),
                // 2. odd number not prime number
                arguments(2, 2, 0),
                // 1. low is 0
                arguments(0, 10, 5),
                arguments(3, 7, 3),
                arguments(8, 10, 1)
        );
    }

    @ParameterizedTest(name = "Calculate {index}")
    @MethodSource("dataProvider")
    public void testCalculate(int low, int high, int excepted) {
        CountOddNumbersInAnIntervalRange calculate =
                new CountOddNumbersInAnIntervalRangeCalculate();
        assertEquals(excepted, calculate.countOdds(low, high));
    }
}
