package leetcode.p1900_1999.p1961_check_if_string_is_prefix_of_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfStringIsPrefixOfArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "a",
                        new String[] {"aa", "aaa", "banana"},
                        false
                ),
                arguments(
                        "iloveleetcode",
                        new String[] {"i", "love", "leetcode", "apples"},
                        true
                ),
                arguments(
                        "iloveleetcode",
                        new String[] {"apples", "i", "love", "leetcode"},
                        false
                )
        );
    }

    @ParameterizedTest(name = "Equals {index}")
    @MethodSource("dataProvider")
    public void testEquals(String s, String[] words, boolean expected) {
        CheckIfStringIsPrefixOfArray equals =
                new CheckIfStringIsPrefixOfArrayEquals();
        assertEquals(expected, equals.isPrefixString(s, words));
    }
}
