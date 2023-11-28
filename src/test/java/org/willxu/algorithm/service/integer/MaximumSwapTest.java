package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumSwapMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSwapTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(2736, 7236),
                Arguments.arguments(9973, 9973)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int num, int excepted) {
        MaximumSwap map = new MaximumSwapMap();
        assertEquals(excepted, map.maximumSwap(num));
    }
}
