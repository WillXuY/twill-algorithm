package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfWordEqualsSummationOfTwoWordsCalculate;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfWordEqualsSummationOfTwoWordsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("acb", "cba", "cdb", true),
                arguments("aaa", "a", "aab", false),
                arguments("aaa", "a", "aaaa", true)
        );
    }

    @ParameterizedTest(name = "Calculate {index}")
    @MethodSource("dataProvider")
    public void testCalculate(String firstWord, String secondWord,
                              String targetWord, boolean excepted) {
        CheckIfWordEqualsSummationOfTwoWords calculate =
                new CheckIfWordEqualsSummationOfTwoWordsCalculate();
        assertEquals(excepted,
                calculate.isSumEqual(firstWord, secondWord, targetWord));
    }
}
