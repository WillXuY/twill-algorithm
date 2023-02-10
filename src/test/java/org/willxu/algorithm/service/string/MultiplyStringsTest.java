package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.MultiplyStringsLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MultiplyStringsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("9", "9", "81"),
                arguments("2", "3", "6"),
                arguments("123", "456", "56088")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String num1, String num2, String excepted) {
        MultiplyStrings loop = new MultiplyStringsLoop();
        assertEquals(excepted, loop.multiply(num1, num2));
    }
}
