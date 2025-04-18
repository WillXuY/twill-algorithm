package leetcode.p0000_0099.p0003_longest_substring_without_repeating_characters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestSubstringWithoutRepeatingCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(" ", 1),
                arguments("", 0),
                arguments("abcabcbb", 3),
                arguments("bbbbb", 1),
                arguments("pwwkew", 3)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String s, int expected) {
        LongestSubstringWithoutRepeatingCharacters set =
                new LongestSubstringWithoutRepeatingCharactersSet();
        assertEquals(expected, set.lengthOfLongestSubstring(s));
    }
}
