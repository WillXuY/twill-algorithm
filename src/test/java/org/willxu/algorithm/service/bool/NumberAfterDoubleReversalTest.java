package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.NumberAfterDoubleReversalLength;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberAfterDoubleReversalTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(1000000, false),
                arguments(526, true),
                arguments(1800, false),
                arguments(0, true)
        );
    }

    @ParameterizedTest(name = "Length {index}")
    @MethodSource("dataProvider")
    public void testLength(int num, boolean expected) {
        NumberAfterDoubleReversal length =
                new NumberAfterDoubleReversalLength();
        assertEquals(expected, length.isSameAfterReversals(num));
    }
}
