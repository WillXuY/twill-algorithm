package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountPairsOfSimilarStringsCount;

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
    public void testCount(String[] words, int excepted) {
        CountPairsOfSimilarStrings count =
                new CountPairsOfSimilarStringsCount();
        assertEquals(excepted, count.similarPairs(words));
    }
}
