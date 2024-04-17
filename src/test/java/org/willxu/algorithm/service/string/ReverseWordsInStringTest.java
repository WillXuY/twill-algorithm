package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.ReverseWordsInStringSplit;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("the sky is blue", "blue is sky the"),
                Arguments.arguments("  hello world ", "world hello"),
                Arguments.arguments("a good   example", "example good a")
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String s, String excepted) {
        ReverseWordsInString split = new ReverseWordsInStringSplit();
        assertEquals(excepted, split.reverseWords(s));
    }
}
