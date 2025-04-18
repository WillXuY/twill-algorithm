package leetcode.p1800_1899.p1880_check_if_word_equals_summation_of_two_words;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
                              String targetWord, boolean expected) {
        CheckIfWordEqualsSummationOfTwoWords calculate =
                new CheckIfWordEqualsSummationOfTwoWordsCalculate();
        assertEquals(expected,
                calculate.isSumEqual(firstWord, secondWord, targetWord));
    }
}
