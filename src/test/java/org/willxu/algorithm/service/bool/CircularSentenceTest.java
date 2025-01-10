package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CircularSentenceSplit;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CircularSentenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("leetcode exercises sound delightful", true),
                arguments("eetcode", true),
                arguments("Leetcode is cool", false),
                arguments("leetcode", false),
                arguments("Leetcode exercises sound delightful", false)
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String sentence, boolean excepted) {
        CircularSentence split = new CircularSentenceSplit();
        assertEquals(excepted, split.isCircularSentence(sentence));
    }
}
