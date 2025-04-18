package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import leetcode.p0000_0099.p0034_find_first_and_lasr_position_of_element_in_sorted_array.FindFirstAndLastPositionOfElementInSortedArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindFirstAndLasrPositionOfElementInSortedArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1}, 1, new int[] {0, 0}),
                arguments(new int[] {5, 7, 7, 8, 8, 10}, 8, new int[] {3, 4}),
                arguments(new int[] {5, 7, 7, 8, 8, 10}, 6, new int[] {-1, -1}),
                arguments(new int[] {}, 0, new int[] {-1, -1})
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int target, int[] expected) {
        FindFirstAndLastPositionOfElementInSortedArray loop =
                new FindFirstAndLastPositionOfElementInSortedArrayLoop();
        assertArrayEquals(expected, loop.searchRange(nums, target));
    }
}
