package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MostFrequentEvenElementMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MostFrequentEvenElementTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {0, 1, 2, 2, 4, 4, 1}, 2),
                arguments(new int[] {4, 4, 4, 9, 2, 4}, 4),
                arguments(new int[] {29, 47, 21, 41, 13, 37, 25, 7}, -1)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] nums, int excepted) {
        MostFrequentEvenElement map = new MostFrequentEvenElementMap();
        assertEquals(excepted, map.mostFrequentEven(nums));
    }
}
