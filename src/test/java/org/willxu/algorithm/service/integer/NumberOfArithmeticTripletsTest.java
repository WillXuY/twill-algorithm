package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfArithmeticTripletsSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfArithmeticTripletsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {0, 1, 4, 6, 7, 10}, 3, 2),
                arguments(new int[] {4, 5, 6, 7, 8, 9}, 2, 2)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] nums, int diff, int expected) {
        NumberOfArithmeticTriplets set = new NumberOfArithmeticTripletsSet();
        assertEquals(expected, set.arithmeticTriplets(nums, diff));
    }
}
