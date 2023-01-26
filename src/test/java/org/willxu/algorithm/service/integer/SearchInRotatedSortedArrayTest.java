package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SearchInRotatedSortedArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SearchInRotatedSortedArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {4, 5, 6, 7, 0, 1, 2}, 0, 4),
                arguments(new int[] {4, 5, 6, 7, 0, 1, 2}, 3, -1),
                arguments(new int[] {1}, 0, -1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int target, int excepted) {
        SearchInRotatedSortedArray loop = new SearchInRotatedSortedArrayLoop();
        assertEquals(excepted, loop.search(nums, target));
    }
}
