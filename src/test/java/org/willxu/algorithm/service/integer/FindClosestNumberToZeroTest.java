package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindClosestNumberToZeroAbs;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindClosestNumberToZeroTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {-4, -2, 1, 4, 8}, 1),
                arguments(new int[] {2, -1, 1}, 1)
        );
    }

    @ParameterizedTest(name = "Abs {index}")
    @MethodSource("dataProvider")
    public void testAbs(int[] nums, int excepted) {
        FindClosestNumberToZero abs = new FindClosestNumberToZeroAbs();
        assertEquals(excepted, abs.findClosestNumber(nums));
    }
}
