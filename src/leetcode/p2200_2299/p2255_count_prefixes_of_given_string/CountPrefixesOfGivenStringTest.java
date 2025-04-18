package leetcode.p2200_2299.p2255_count_prefixes_of_given_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountPrefixesOfGivenStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"a","b","c","ab","bc","abc"}, "abc", 3),
                arguments(new String[] {"a", "a"}, "aa", 2)
        );
    }

    @ParameterizedTest(name = "Regex {index}")
    @MethodSource("dataProvider")
    public void testRegex(String[] words, String s, int expected) {
        CountPrefixesOfGivenString regex =
                new CountPrefixesOfGivenStringRegex();
        assertEquals(expected, regex.countPrefixes(words, s));
    }
}
