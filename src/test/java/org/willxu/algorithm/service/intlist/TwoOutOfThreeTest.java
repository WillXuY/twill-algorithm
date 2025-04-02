package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.intlist.TwoOutOfThreeCount;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoOutOfThreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 1, 3, 2},
                        new int[] {2, 3},
                        new int[] {3},
                        Stream.of(2, 3).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {3, 1},
                        new int[] {2, 3},
                        new int[] {1, 2},
                        Stream.of(1, 2, 3).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 2, 2},
                        new int[] {4, 3, 3},
                        new int[] {5},
                        Collections.emptyList()
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(
            int[] nums1, int[] nums2, int[] nums3, List<Integer> expected) {
        TwoOutOfThree count = new TwoOutOfThreeCount();
        assertArrayEquals(expected.toArray()
                , count.twoOutOfThree(nums1, nums2, nums3).toArray());
    }
}
