package leetcode.p0800_0899.p0820_short_encoding_of_words;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortEncodingOfWordsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new String[] {"me", "time"},
                        5
                ),
                Arguments.arguments(
                        new String[] {"time", "me", "bell"},
                        10
                ),
                Arguments.arguments(
                        new String[] {"t"},
                        2
                )
        );
    }

    @ParameterizedTest(name = "Regex {index}")
    @MethodSource("dataProvider")
    public void testRegex(String[] words, int expected) {
        ShortEncodingOfWords regex = new ShortEncodingOfWordsRegex();
        assertEquals(expected, regex.minimumLengthEncoding(words));
    }
}
