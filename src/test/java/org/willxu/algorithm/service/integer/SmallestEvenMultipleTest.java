package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SmallestEvenMultipleAnd;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SmallestEvenMultipleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(5, 10),
                arguments(6, 6)
        );
    }

    @ParameterizedTest(name = "And {index}")
    @MethodSource("dataProvider")
    public void testAnd(int n, int excepted) {
        SmallestEvenMultiple and = new SmallestEvenMultipleAnd();
        assertEquals(excepted, and.smallestEvenMultiple(n));
    }
}
