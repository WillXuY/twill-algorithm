package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import leetcode.p2200_2299.p2206_divide_array_info_equal_pairs.DivideArrayIntoEqualPairsParity;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DivideArrayInfoEqualPairsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 2, 3, 2, 2, 2}, true),
                arguments(new int[] {1, 2, 3, 4}, false)
        );
    }

    @ParameterizedTest(name = "Parity {index}")
    @MethodSource("dataProvider")
    public void testParity(int[] nums, boolean expected) {
        DivideArrayIntoEqualPairs parity =
                new DivideArrayIntoEqualPairsParity();
        assertEquals(expected, parity.divideArray(nums));
    }
}
