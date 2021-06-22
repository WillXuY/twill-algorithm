package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ReverseIntegerModulus;

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

    @ParameterizedTest(name = "Modulus {index}")
    @MethodSource("dataProvider")
    public void testModulus(int input, int output) {
        ReverseInteger modulus = new ReverseIntegerModulus();
        assertEquals(output, modulus.reverseInteger(input));
    }
}
