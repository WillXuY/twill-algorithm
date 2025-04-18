package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.ReverseVowelsOfaStringPointer;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseVowelsOfaStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("hello", "holle"),
                Arguments.arguments("leetcode", "leotcede")
        );
    }

    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(String input, String expected) {
        ReverseVowelsOfaString pointer = new ReverseVowelsOfaStringPointer();
        assertEquals(expected, pointer.reverseVowels(input));
    }
}
