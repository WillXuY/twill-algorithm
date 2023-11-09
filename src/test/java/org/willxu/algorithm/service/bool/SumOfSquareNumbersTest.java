package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.SumOfSquareNumbersSqrt;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfSquareNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(0, true),
                Arguments.arguments(5, true),
                Arguments.arguments(3, false)
        );
    }

    @ParameterizedTest(name = "Sqrt {index}")
    @MethodSource("dataProvider")
    public void testSqrt(int c, boolean excepted) {
        SumOfSquareNumbers sqrt = new SumOfSquareNumbersSqrt();
        assertEquals(excepted, sqrt.judgeSquareSum(c));
    }
}
