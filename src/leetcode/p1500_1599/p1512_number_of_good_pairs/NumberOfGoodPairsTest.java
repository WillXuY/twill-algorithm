package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfGoodPairsMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfGoodPairsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 1, 1, 3}, 4),
                arguments(new int[] {1, 1, 1, 1}, 6),
                arguments(new int[] {1, 2, 3}, 0)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] nums, int expected) {
        NumberOfGoodPairs map = new NumberOfGoodPairsMap();
        assertEquals(expected, map.numIdenticalPairs(nums));
    }
}
