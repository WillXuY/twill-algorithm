package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.LargestPositiveIntegerThatExistsWithItsNegativeSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestPositiveIntegerThatExistsWithItsNegativeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {-1, 2, -3, 3}, 3),
                arguments(new int[] {-1, 10, 6, 7, -7, 1}, 7),
                arguments(new int[] {-10, 8, 6, 7, -2, -3}, -1)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] nums, int excepted) {
        LargestPositiveIntegerThatExistsWithItsNegative set =
                new LargestPositiveIntegerThatExistsWithItsNegativeSet();
        assertEquals(excepted, set.findMaxK(nums));
    }
}
