package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.SearchInRotatedSortedArrayIiLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SearchInRotatedSortedArrayIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 5, 6, 0, 0, 1, 2}, 0, true),
                arguments(new int[] {2, 5, 6, 0, 0, 1, 2}, 3, false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int target, boolean excepted) {
        SearchInRotatedSortedArrayIi loop =
                new SearchInRotatedSortedArrayIiLoop();
        assertEquals(excepted, loop.search(nums, target));
    }
}
