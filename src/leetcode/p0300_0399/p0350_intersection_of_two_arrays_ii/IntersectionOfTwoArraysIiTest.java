package leetcode.p0300_0399.p0350_intersection_of_two_arrays_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testRemove(int[] nums1, int[] nums2, int[] expected) {
        IntersectionOfTwoArraysIi remove =
                new IntersectionOfTwoArraysIiRemove();
        assertArrayEquals(expected, remove.intersect(nums1, nums2));
    }

}
