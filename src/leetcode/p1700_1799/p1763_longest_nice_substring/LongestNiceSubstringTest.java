package leetcode.p1700_1799.p1763_longest_nice_substring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestNiceSubstringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("YazaAay", "aAa"),
                arguments("Bb", "Bb"),
                arguments("c", "")
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String s, String expected) {
        LongestNiceSubstring set = new LongestNiceSubstringSet();
        assertEquals(expected, set.longestNiceSubstring(s));
    }
}
