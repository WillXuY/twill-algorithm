package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.RepeatedSubstringPatternPointer;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RepeatedSubstringPatternTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 4
                arguments("abacababacab", true),
                // Wrong answer 3
                arguments("abaababaab", true),
                // Wrong answer 2
                arguments("ababba", false),
                // Wrong answer1
                arguments("a", false),
                arguments("abab", true),
                arguments("aba", false),
                arguments("abcabcabcabc", true)
        );
    }

    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(String input, boolean expected) {
        RepeatedSubstringPattern pointer = new RepeatedSubstringPatternPointer();
        assertEquals(expected, pointer.repeatedSubstringPattern(input));
    }
}
