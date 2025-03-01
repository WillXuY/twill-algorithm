package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountSquareSumTriplesExhaustive;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountSquareSumTriplesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(5, 2),
                arguments(10, 4)
        );
    }

    @ParameterizedTest(name = "Exhaustive {index}")
    @MethodSource("dataProvider")
    public void testExhaustive(int n, int expected) {
        CountSquareSumTriples exhaustive =
                new CountSquareSumTriplesExhaustive();
        assertEquals(expected, exhaustive.countTriples(n));
    }
}
