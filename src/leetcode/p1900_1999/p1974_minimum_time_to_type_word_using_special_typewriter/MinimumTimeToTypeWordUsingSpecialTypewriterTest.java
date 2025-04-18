package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumTimeToTypeWordUsingSpecialTypewriterSubtraction;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumTimeToTypeWordUsingSpecialTypewriterTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abc", 5),
                arguments("bza", 7),
                arguments("zjpc", 34)
        );
    }

    @ParameterizedTest(name = "Subtraction {index}")
    @MethodSource("dataProvider")
    public void testSubtraction(String word, int expected) {
        MinimumTimeToTypeWordUsingSpecialTypewriter subtraction =
                new MinimumTimeToTypeWordUsingSpecialTypewriterSubtraction();
        assertEquals(expected, subtraction.minTimeToType(word));
    }
}
