package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountIntegersWithEvenDigitSumCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountIntegersWithEvenDigitSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4, 2),
                arguments(30, 14)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int num, int excepted) {
        CountIntegersWithEvenDigitSum count =
                new CountIntegersWithEvenDigitSumCount();
        assertEquals(excepted, count.countEven(num));
    }
}
