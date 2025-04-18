package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.PercentageOfLetterInStringCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PercentageOfLetterInStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("foobar", 'o', 33),
                arguments("jjjj", 'k', 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, char letter, int expected) {
        PercentageOfLetterInString count =
                new PercentageOfLetterInStringCount();
        assertEquals(expected, count.percentageLetter(s, letter));
    }
}
