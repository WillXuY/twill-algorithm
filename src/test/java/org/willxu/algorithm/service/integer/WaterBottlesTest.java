package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.WaterBottlesLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class WaterBottlesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(9, 3, 13),
                arguments(15, 4, 19)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int numBottles, int numExchange, int excepted) {
        WaterBottles loop = new WaterBottlesLoop();
        assertEquals(excepted, loop.numWaterBottles(numBottles, numExchange));
    }
}
