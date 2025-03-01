package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.SortArrayByIncreasingFrequencyMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SortArrayByIncreasingFrequencyTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 5, 0, 5}, new int[] {1, 0, 5, 5}),
                arguments(
                        new int[] {1, 1, 2, 2, 2, 3},
                        new int[] {3, 1, 1, 2, 2, 2}
                ),
                arguments(new int[] {2, 3, 1, 3, 2}, new int[] {1, 3, 3, 2, 2}),
                arguments(
                        new int[] {-1, 1, -6, 4, 5, -6, 1, 4, 1},
                        new int[] {5, -1, 4, 4, -6, -6, 1, 1, 1}
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] nums, int[] expected) {
        SortArrayByIncreasingFrequency map =
                new SortArrayByIncreasingFrequencyMap();
        assertArrayEquals(expected, map.frequencySort(nums));
    }
}
