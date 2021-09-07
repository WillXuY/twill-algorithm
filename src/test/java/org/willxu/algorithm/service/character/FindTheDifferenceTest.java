package org.willxu.algorithm.service.character;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.character.FindTheDifferenceRemove;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDifferenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("abcd", "abcde", 'e'),
                Arguments.arguments("", "y", 'y'),
                Arguments.arguments("a", "aa", 'a'),
                Arguments.arguments("ae", "aea", 'a')
        );
    }

    @ParameterizedTest(name = "Remove {index}")
    @MethodSource("dataProvider")
    public void testRemove(String s, String t, char excepted) {
        FindTheDifference remove = new FindTheDifferenceRemove();
        assertEquals(excepted, remove.findTheDifference(s, t));
    }
}
