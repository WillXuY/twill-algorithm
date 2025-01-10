package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumNumberOfWordsFoundInSentencesSplit;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumNumberOfWordsFoundInSentencesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {
                                "alice and bob love leetcode",
                                "i think so too",
                                "this is great thanks very much"
                        },
                        6
                ),
                arguments(
                        new String[] {
                                "please wait",
                                "continue to fight",
                                "continue to win"
                        },
                        3
                )
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String[] sentences, int excepted) {
        MaximumNumberOfWordsFoundInSentences split =
                new MaximumNumberOfWordsFoundInSentencesSplit();
        assertEquals(excepted, split.mostWordsFound(sentences));
    }
}
