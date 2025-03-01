package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumDifferenceBetweenHighestAndLowestOfScoresSort;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumDifferenceBetweenHighestAndLowestOfScoresTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {
                        87063, 61094, 44530, 21297, 95857, 93551, 9918
                        }, 6, 74560),
                arguments(new int[] {90}, 1, 0),
                arguments(new int[] {9, 4, 1, 7}, 2, 2)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] nums, int k, int expected) {
        MinimumDifferenceBetweenHighestAndLowestOfScores sort =
                new MinimumDifferenceBetweenHighestAndLowestOfScoresSort();
        assertEquals(expected, sort.minimumDifference(nums, k));
    }
}
