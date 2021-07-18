package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FactorialTrailingZeroesFind5;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FactorialTrailingZeroesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Explanation: 3! = 6, no trailing zero.
                arguments(3, 0),
                arguments(5, 1),
                arguments(0, 0)
        );
    }

    @ParameterizedTest(name = "Find5 {index}")
    @MethodSource("dataProvider")
    public void testFind5(int input, int excepted) {
        FactorialTrailingZeroes find5 = new FactorialTrailingZeroesFind5();
        assertEquals(excepted, find5.trailingZeroes(input));
    }
}
