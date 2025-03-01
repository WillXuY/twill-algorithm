package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.Largest3SameDigitNumberInStringLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Largest3SameDigitNumberInStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("6777133339", "777"),
                arguments("2300019", "000"),
                arguments("42352338", "")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String num, String expected) {
        Largest3SameDigitNumberInString loop =
                new Largest3SameDigitNumberInStringLoop();
        assertEquals(expected, loop.largestGoodInteger(num));
    }
}
