package org.willxu.algorithm.service.str2int;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.str2int.RomanToIntegerBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RomanToIntegerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("III", 3),
                arguments("IV", 4),
                arguments("IX", 9),
                arguments("LVIII", 58),
                arguments("MCMXCIV", 1994)
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testRomanToInteger(String input, int output) {
        RomanToInteger bruteForce = new RomanToIntegerBruteForce();
        assertEquals(output, bruteForce.romanToInteger(input));
    }
}
