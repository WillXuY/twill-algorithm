package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountCommonWordsWithOneOccurrenceRetain;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountCommonWordsWithOneOccurrenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"leetcode", "is", "amazing", "as", "is"},
                        new String[] {"amazing", "leetcode", "is"},
                        2
                ),
                arguments(
                        new String[] {"b", "bb", "bbb"},
                        new String[] {"a", "aa", "aaa"},
                        0
                ),
                arguments(
                        new String[] {"a", "ab"},
                        new String[] {"a", "a", "a", "ab"},
                        1
                )
        );
    }

    @ParameterizedTest(name = "Retain {index}")
    @MethodSource("dataProvider")
    public void testRetain(String[] words1, String[] words2, int excepted) {
        CountCommonWordsWithOneOccurrence retain =
                new CountCommonWordsWithOneOccurrenceRetain();
        assertEquals(excepted, retain.countWords(words1, words2));
    }
}
