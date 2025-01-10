package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumNumberOfWordsYouCanTypeSplit;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumNumberOfWordsYouCanTypeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("hello world", "ad", 1),
                arguments("leet code", "lt", 1),
                arguments("leet code", "e", 0)
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String text, String brokenLetters, int excepted) {
        MaximumNumberOfWordsYouCanType split =
                new MaximumNumberOfWordsYouCanTypeSplit();
        assertEquals(excepted, split.canBeTypedWords(text, brokenLetters));
    }
}
