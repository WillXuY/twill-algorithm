package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.HammingDistanceDividing;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class HammingDistanceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                1 0x0001
                4 0x0100
                ^      2
                 */
                arguments(1, 4, 2),
                arguments(3, 1, 1)
        );
    }

    @ParameterizedTest(name = "Dividing {index}")
    @MethodSource("dataProvider")
    public void testDividing(int x, int y, int expected) {
        HammingDistance dividing = new HammingDistanceDividing();
        assertEquals(expected, dividing.hammingDistance(x, y));
    }
}
