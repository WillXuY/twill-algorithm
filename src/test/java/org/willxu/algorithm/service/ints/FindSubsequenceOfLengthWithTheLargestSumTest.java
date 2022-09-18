package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.FindSubsequenceOfLengthWithTheLargestSumSort;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindSubsequenceOfLengthWithTheLargestSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {50, -75}, 2, new int[] {50, -75}),
                arguments(new int[] {2, 1, 3, 3}, 2, new int[] {3, 3}),
                arguments(new int[] {-1, -2, 3, 4}, 3, new int[] {-1, 3, 4}),
                arguments(new int[] {3, 4, 3, 3}, 2, new int[] {3, 4})
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] nums, int k, int[] excepted) {
        FindSubsequenceOfLengthWithTheLargestSum sort =
                new FindSubsequenceOfLengthWithTheLargestSumSort();
        assertArrayEquals(excepted, sort.maxSubsequence(nums, k));
    }
}
