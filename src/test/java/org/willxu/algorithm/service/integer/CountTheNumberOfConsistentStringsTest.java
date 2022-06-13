package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountTheNumberOfConsistentStringsSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountTheNumberOfConsistentStringsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "ab",
                        new String[] {"ad", "bd", "aaab", "baa", "badab"},
                        2
                ),
                arguments(
                        "abc",
                        new String[] {"a", "b", "c", "ab", "ac", "bc", "abc"},
                        7
                ),
                arguments(
                        "cad",
                        new String[] {
                                "cc", "acd", "b", "ba", "bac", "bad", "ac", "d"
                        },
                        4
                )
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String allowed, String[] words, int excepted) {
        CountTheNumberOfConsistentStrings set =
                new CountTheNumberOfConsistentStringsSet();
        assertEquals(excepted, set.countConsistentStrings(allowed, words));
    }
}
