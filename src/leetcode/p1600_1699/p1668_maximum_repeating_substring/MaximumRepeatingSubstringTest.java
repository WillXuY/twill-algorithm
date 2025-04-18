package leetcode.p1600_1699.p1668_maximum_repeating_substring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumRepeatingSubstringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba", 5),
                arguments("a", "a", 1),
                arguments("ababc", "ab", 2),
                arguments("ababc", "ba", 1),
                arguments("ababc", "ac", 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String sequence, String word, int expected) {
        MaximumRepeatingSubstring loop = new MaximumRepeatingSubstringLoop();
        assertEquals(expected, loop.maxRepeating(sequence, word));
    }
}
