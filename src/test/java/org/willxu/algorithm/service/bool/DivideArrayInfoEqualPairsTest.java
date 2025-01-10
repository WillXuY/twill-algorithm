package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.DivideArrayIntoEqualPairsParity;

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
    public void testParity(int[] nums, boolean excepted) {
        DivideArrayIntoEqualPairs parity =
                new DivideArrayIntoEqualPairsParity();
        assertEquals(excepted, parity.divideArray(nums));
    }
}
