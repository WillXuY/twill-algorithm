package leetcode.p2500_2599.p2506_count_pairs_of_similar_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountPairsOfSimilarStringsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"aba","aabb","abcd","bac","aabc"}, 2),
                arguments(new String[] {"aabb","ab","ba"}, 3),
                arguments(new String[] {"nba","cba","dba"}, 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String[] words, int expected) {
        CountPairsOfSimilarStrings count =
                new CountPairsOfSimilarStringsCount();
        assertEquals(expected, count.similarPairs(words));
    }
}
