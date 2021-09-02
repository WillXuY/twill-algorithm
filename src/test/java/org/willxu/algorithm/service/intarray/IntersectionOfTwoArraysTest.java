package org.willxu.algorithm.service.intarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.intarray.IntersectionOfTwoArraysSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntersectionOfTwoArraysTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {1, 2, 2, 1},
                        new int[] {2, 2},
                        new int[] {2}
                ),
                Arguments.arguments(
                        new int[] {4, 9, 5},
                        new int[] {9, 4, 9, 8, 4},
                        // [4, 9] is also accepted
                        new int[] {4, 9}
                )
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] nums1, int[] nums2, int[] excepted) {
        IntersectionOfTwoArrays set = new IntersectionOfTwoArraysSet();
        assertArrayEquals(excepted, set.intersection(nums1, nums2));
    }
}
