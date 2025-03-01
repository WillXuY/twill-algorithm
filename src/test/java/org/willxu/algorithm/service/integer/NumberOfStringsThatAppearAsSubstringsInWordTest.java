package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfStringsThatAppearAsSubstringsInWordContains;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfStringsThatAppearAsSubstringsInWordTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"a", "abc", "bc", "d"}, "abc", 3),
                arguments(new String[] {"a", "b", "c"}, "aaaaabbbbb", 2),
                arguments(new String[] {"a", "a", "a"}, "ab", 3)
        );
    }

    @ParameterizedTest(name = "Contains {index}")
    @MethodSource("dataProvider")
    public void testContains(String[] patterns, String word, int expected) {
        NumberOfStringsThatAppearAsSubstringsInWord contains =
                new NumberOfStringsThatAppearAsSubstringsInWordContains();
        assertEquals(expected, contains.numOfStrings(patterns, word));
    }
}
