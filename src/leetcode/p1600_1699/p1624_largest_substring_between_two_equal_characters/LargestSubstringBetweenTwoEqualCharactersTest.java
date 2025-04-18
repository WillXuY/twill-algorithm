package leetcode.p1600_1699.p1624_largest_substring_between_two_equal_characters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestSubstringBetweenTwoEqualCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aa", 0),
                arguments("abca", 2),
                arguments("cbzxy", -1)
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(String s, int expected) {
        LargestSubstringBetweenTwoEqualCharacters index =
                new LargestSubstringBetweenTwoEqualCharactersIndex();
        assertEquals(expected, index.maxLengthBetweenEqualCharacters(s));
    }
}
