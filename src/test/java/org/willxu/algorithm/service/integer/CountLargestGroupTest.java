package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountLargestGroupCalculate;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountLargestGroupTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(13, 4),
                arguments(2, 2),
                arguments(264, 2)
        );
    }

    @ParameterizedTest(name = "Calculate {index}")
    @MethodSource("dataProvider")
    public void testCalculate(int n, int excepted) {
        CountLargestGroup calculate = new CountLargestGroupCalculate();
        assertEquals(excepted, calculate.countLargestGroup(n));
    }
}
