package leetcode.p1700_1799.p1768_merge_strings_alternately;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MergeStringsAlternatelyTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abc", "pqr", "apbqcr"),
                arguments("ab", "pqrs", "apbqrs"),
                arguments("abcd", "pq", "apbqcd")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String word1, String word2, String expected) {
        MergeStringsAlternately loop = new MergeStringsAlternatelyLoop();
        assertEquals(expected, loop.mergeAlternately(word1, word2));
    }
}
