package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SearchInsertPositionBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SearchInsertPositionTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[]{1, 3, 5, 6}, 5, 2),
                arguments(new int[]{1, 3, 5, 6}, 2, 1),
                arguments(new int[]{1, 3, 5, 6}, 7, 4),
                arguments(new int[]{1, 3, 5, 6}, 0, 0),
                arguments(new int[]{1}, 0, 0)
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testSearchInsertPosition(int[] nums, int target, int output) {
        SearchInsertPosition bruteForce = new SearchInsertPositionBruteForce();
        assertEquals(output, bruteForce.searchInsert(nums, target));
    }
}
