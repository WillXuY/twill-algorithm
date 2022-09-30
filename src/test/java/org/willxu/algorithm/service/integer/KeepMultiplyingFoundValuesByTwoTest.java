package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.KeepMultiplyingFoundValuesByTwoSet;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class KeepMultiplyingFoundValuesByTwoTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {5, 3, 6, 1, 12}, 3, 24),
                arguments(new int[] {2, 7, 9}, 4, 4)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] nums, int original, int excepted) {
        KeepMultiplyingFoundValuesByTwo set =
                new KeepMultiplyingFoundValuesByTwoSet();
        assertEquals(excepted, set.findFinalValue(nums, original));
    }
}
