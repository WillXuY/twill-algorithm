package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.IntersectionOfTwoArraysIiRemove;
import org.willxu.algorithm.service.ints.IntersectionOfTwoArraysIi;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntersectionOfTwoArraysIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {1, 2, 2, 1},
                        new int[] {2, 2},
                        new int[] {2, 2}
                ),
                Arguments.arguments(
                        new int[] {4, 9, 5},
                        new int[] {9, 4, 9, 8, 4},
                        // [4, 9] is also accepted
                        new int[] {9, 4}
                )
        );
    }

    @ParameterizedTest(name = "Remove {index}")
    @MethodSource("dataProvider")
    public void testRemove(int[] nums1, int[] nums2, int[] excepted) {
        IntersectionOfTwoArraysIi remove =
                new IntersectionOfTwoArraysIiRemove();
        assertArrayEquals(excepted, remove.intersect(nums1, nums2));
    }

}
