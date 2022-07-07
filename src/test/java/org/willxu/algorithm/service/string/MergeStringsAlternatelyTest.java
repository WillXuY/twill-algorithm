package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.MergeStringsAlternatelyLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MergeStringsAlternatelyTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abc", "pqr", "apbqcr"),
                arguments("ab", "pqrs", "apbqrs"),
                arguments("abcd", "pq", "apbqcd")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String word1, String word2, String excepted) {
        MergeStringsAlternately loop = new MergeStringsAlternatelyLoop();
        assertEquals(excepted, loop.mergeAlternately(word1, word2));
    }
}
