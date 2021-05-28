package org.willxu.algorithm.service.int2int;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.int2int.ReverseIntegerBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReverseIntegerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(123, 321),
                arguments(-123, -321),
                arguments(120, 21),
                arguments(Integer.MIN_VALUE, 0),
                arguments(0, 0)
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testReverseInteger(int input, int output) {
        ReverseInteger bruteForce = new ReverseIntegerBruteForce();
        assertEquals(output, bruteForce.reverseInteger(input));
    }
}
