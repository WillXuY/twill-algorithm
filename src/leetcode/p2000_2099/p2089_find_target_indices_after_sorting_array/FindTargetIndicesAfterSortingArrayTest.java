package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.intlist.FindTargetIndicesAfterSortingArraySort;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindTargetIndicesAfterSortingArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        // 1, 2, 2, 3, 5
                        new int[] {1, 2, 5, 2, 3},
                        2,
                        Stream.of(1, 2).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 2, 5, 2, 3},
                        3,
                        Stream.of(3).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 2, 5, 2, 3},
                        5,
                        Stream.of(4).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] nums, int target, List<String> expected) {
        FindTargetIndicesAfterSortingArray sort =
                new FindTargetIndicesAfterSortingArraySort();
        assertArrayEquals(expected.toArray(),
                sort.targetIndices(nums, target).toArray());
    }
}
