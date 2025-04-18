package leetcode.p2200_2299.p2215_find_the_difference_of_two_arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindTheDifferenceOfTwoArraysTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 2, 3}, new int[] {2, 4, 6},
                        Stream.of(
                                Stream.of(
                                        1, 3
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        4, 6
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 2, 3, 3}, new int[] {1, 1, 2, 2},
                        Stream.of(
                                Stream.of(
                                        3
                                ).collect(Collectors.toList()),
                                Collections.emptyList()
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Remove {index}")
    @MethodSource("dataProvider")
    public void testRemove(
            int[] nums1, int[] nums2, List<List<Integer>> expected) {
        FindTheDifferenceOfTwoArrays remove =
                new FindTheDifferenceOfTwoArraysRemove();
        List<List<Integer>> output = remove.findDifference(nums1, nums2);
        assertArrayEquals(expected.get(0).toArray(), output.get(0).toArray());
        assertArrayEquals(expected.get(1).toArray(), output.get(1).toArray());
    }
}
