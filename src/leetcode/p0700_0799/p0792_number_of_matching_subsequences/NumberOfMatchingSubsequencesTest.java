package leetcode.p0700_0799.p0792_number_of_matching_subsequences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfMatchingSubsequencesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        "abcde",
                        new String[] {
                                "a","bb","acd","ace"
                        },
                        3
                ),
                Arguments.arguments(
                        "dsahjpjauf",
                        new String[] {
                                "ahjpjau","ja","ahbwzgqnuk","tnmlanowax"
                        },
                        2
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, String[] words, int expected) {
        NumberOfMatchingSubsequences loop =
                new NumberOfMatchingSubsequencesLoop();
        assertEquals(expected, loop.numMatchingSubseq(s, words));
    }

    /**
     * Time Limit Exceeded
     */
    @ParameterizedTest(name = "Regex {index}")
    @MethodSource("dataProvider")
    public void testRegex(String s, String[] words, int expected) {
        NumberOfMatchingSubsequences regex =
                new NumberOfMatchingSubsequencesRegex();
        assertEquals(expected, regex.numMatchingSubseq(s, words));
    }
}
