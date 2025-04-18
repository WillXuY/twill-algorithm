package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MakeArrayZeroBySubtractingEqualAmountsSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MakeArrayZeroBySubtractingEqualAmountsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1}, 1),
                arguments(new int[] {1, 5, 0, 3, 5}, 3),
                arguments(new int[] {0}, 0)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] nums, int expected) {
        MakeArrayZeroBySubtractingEqualAmounts set =
                new MakeArrayZeroBySubtractingEqualAmountsSet();
        assertEquals(expected, set.minimumOperations(nums));
    }
}
