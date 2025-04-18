package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.ThreeConsecutiveOddsCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ThreeConsecutiveOddsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 6, 4, 1}, false),
                arguments(new int[] {1, 2, 34, 3, 4, 5, 7, 23, 12}, true)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] arr, boolean expected) {
        ThreeConsecutiveOdds count = new ThreeConsecutiveOddsCount();
        assertEquals(expected, count.threeConsecutiveOdds(arr));
    }
}
