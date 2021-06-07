package org.example.example.service.integer;

import org.example.example.service.impl.integer.LengthOfLastWordBruteForce;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LengthOfLastWordTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("Hello World", 5),
                arguments(" ", 0)
        );
    }

    @ParameterizedTest(name = "Error param {index}")
    @MethodSource("dataProvider")
    public void testLengthOfLastWord(String s, int output) {
        LengthOfLastWord bruteForce = new LengthOfLastWordBruteForce();
        assertEquals(output, bruteForce.lengthOfLastWord(s));
    }
}
