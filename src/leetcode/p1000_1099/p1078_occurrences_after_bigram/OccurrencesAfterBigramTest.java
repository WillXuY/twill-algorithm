package leetcode.p1000_1099.p1078_occurrences_after_bigram;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class OccurrencesAfterBigramTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. add matching edges.
                arguments(
                        "alice is aa good girl she is a good student",
                        "a", "good",
                        new String[] {"student"}
                ),
                arguments(
                        "alice is a good girl she is a good student",
                        "a", "good",
                        new String[] {"girl", "student"}
                ),
                arguments(
                        "we will we will rock you",
                        "we", "will",
                        new String[] {"we", "rock"}
                )
        );
    }

    @ParameterizedTest(name = "Regex {index}")
    @MethodSource("dataProvider")
    public void testRegex(String text, String first, String second,
                          String[] expected) {
        OccurrencesAfterBigram regex = new OccurrencesAfterBigramRegex();
        assertArrayEquals(expected, regex.findOcurrences(text, first, second));
    }
}
