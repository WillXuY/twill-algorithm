package org.willxu.algorithm.service.integerlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integerlist.TwoSumBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * test case
 */
public class TwoSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                arguments(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                arguments(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testTwoSum(int[] nums, int target, int[] output) {
        TwoSum bruteForce = new TwoSumBruteForce();
        assertArrayEquals(output, bruteForce.getTwoSum(nums, target));
    }
}
