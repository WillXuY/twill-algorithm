package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.LongestSubsequenceWithLimitedSumSort;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestSubsequenceWithLimitedSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {4, 5, 2, 1},
                        new int[] {3, 10, 21},
                        new int[] {2, 3, 4}
                ),
                arguments(new int[] {2, 3, 4, 5}, new int[] {1}, new int[] {0})
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] nums, int[] queries, int[] excepted) {
        LongestSubsequenceWithLimitedSum sort =
                new LongestSubsequenceWithLimitedSumSort();
        assertArrayEquals(excepted, sort.answerQueries(nums, queries));
    }
}
