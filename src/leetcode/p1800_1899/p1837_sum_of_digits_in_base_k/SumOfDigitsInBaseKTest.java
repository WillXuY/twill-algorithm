package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SumOfDigitsInBaseKDivide;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SumOfDigitsInBaseKTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(34, 6, 9),
                arguments(10, 10, 1)
        );
    }

    @ParameterizedTest(name = "Divide {index}")
    @MethodSource("dataProvider")
    public void testDivide(int n, int k, int expected) {
        SumOfDigitsInBaseK divide = new SumOfDigitsInBaseKDivide();
        assertEquals(expected, divide.sumBase(n, k));
    }
}
