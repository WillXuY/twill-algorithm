package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckWhetherTwoStringsAreAlmostEquivalentCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckWhetherTwoStringsAreAlmostEquivalentTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aaaa", "bccb", false),
                arguments("abcdeef", "abaaacc", true),
                arguments("cccddabba", "babababab", true)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String word1, String word2, boolean expected) {
        CheckWhetherTwoStringsAreAlmostEquivalent count =
                new CheckWhetherTwoStringsAreAlmostEquivalentCount();
        assertEquals(expected, count.checkAlmostEquivalent(word1, word2));
    }
}
