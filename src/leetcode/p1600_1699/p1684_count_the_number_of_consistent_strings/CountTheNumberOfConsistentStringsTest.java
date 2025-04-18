package leetcode.p1600_1699.p1684_count_the_number_of_consistent_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountTheNumberOfConsistentStringsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "ab",
                        new String[] {"ad", "bd", "aaab", "baa", "badab"},
                        2
                ),
                arguments(
                        "abc",
                        new String[] {"a", "b", "c", "ab", "ac", "bc", "abc"},
                        7
                ),
                arguments(
                        "cad",
                        new String[] {
                                "cc", "acd", "b", "ba", "bac", "bad", "ac", "d"
                        },
                        4
                )
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String allowed, String[] words, int expected) {
        CountTheNumberOfConsistentStrings set =
                new CountTheNumberOfConsistentStringsSet();
        assertEquals(expected, set.countConsistentStrings(allowed, words));
    }
}
