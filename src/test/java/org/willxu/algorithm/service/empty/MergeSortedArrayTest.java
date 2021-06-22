package org.willxu.algorithm.service.empty;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.empty.MergeSortedArrayInverted;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MergeSortedArrayTest {

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        /*
                        Explanation: The arrays we are merging are
                        [1, 2, 3] and [2, 5, 6]. The result of the
                        merge is [1, 2, 2, 3, 5, 6] with the underlined
                        elements coming from nums1.
                         */
                        new int[] {1, 2, 3, 0, 0, 0}, 3,
                        new int[] {2, 5, 6}, 3,
                        new int[] {1, 2, 2, 3, 5, 6}
                ),
                arguments(
                        /*
                        Explanation: The arrays we are merging are [1]
                        and []. The result of the merge is [1].
                         */
                        new int[] {1}, 1,
                        new int[0], 0,
                        new int[] {1}
                ),
                arguments(
                        /*
                        Explanation: The arrays we are merging are []
                        and [1]. The result of the merge is [1].
                        Note that because m = 0, there are no elements
                        int nums1. The 0 is only there to ensure the
                        merge result can fit in nums1.
                         */
                        new int[] {0}, 0,
                        new int[] {1}, 1,
                        new int[] {1}
                ),
                arguments(
                        /*
                        Wrong answer 1:
                         */
                        new int[] {2, 0}, 1,
                        new int[] {1}, 1,
                        new int[] {1, 2}
                ),
                arguments(
                        /*
                        Wrong answer 2: should not copy full num2 array
                         */
                        new int[] {4, 0, 0, 0, 0, 0}, 1,
                        new int[] {1, 2, 3, 5, 6}, 5,
                        new int[] {1, 2, 3, 4, 5, 6}
                )
        );
    }

    @ParameterizedTest(name = "MergeSortedArray {index}")
    @MethodSource("dataProvider")
    public void testMergeSortedArray(
            int[] nums1, int m, int[] nums2, int n, int[] output) {
        MergeSortedArray inverted = new MergeSortedArrayInverted();
        inverted.merge(nums1, m, nums2, n);
        assertArrayEquals(output, nums1);
    }
}
