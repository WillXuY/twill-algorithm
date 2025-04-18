package leetcode.p1800_1899.p1876_substrings_of_size_three_with_distinct_characters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubstringsOfSizeThreeWithDistinctCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("xyzzaz", 1),
                arguments("aababcabc", 4)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int expected) {
        SubstringsOfSizeThreeWithDistinctCharacters loop =
                new SubstringsOfSizeThreeWithDistinctCharactersLoop();
        assertEquals(expected, loop.countGoodSubstrings(s));
    }
}
