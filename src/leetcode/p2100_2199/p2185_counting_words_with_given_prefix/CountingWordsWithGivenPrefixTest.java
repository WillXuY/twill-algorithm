package leetcode.p2100_2199.p2185_counting_words_with_given_prefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountingWordsWithGivenPrefixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"pay","attention","practice","attend"},
                        "at", 2
                ),
                arguments(
                        new String[] {"leetcode","win","loops","success"},
                        "code", 0
                )
        );
    }

    @ParameterizedTest(name = "Regex {index}")
    @MethodSource("dataProvider")
    public void testRegex(String[] words, String pref, int expected) {
        CountingWordsWithGivenPrefix regex =
                new CountingWordsWithGivenPrefixRegex();
        assertEquals(expected, regex.prefixCount(words, pref));
    }
}
