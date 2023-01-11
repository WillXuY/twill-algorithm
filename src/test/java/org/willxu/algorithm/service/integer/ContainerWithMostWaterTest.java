package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ContainerWithMostWaterLoop;
import org.willxu.algorithm.service.impl.integer.ContainerWithMostWaterPointer;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ContainerWithMostWaterTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 4, 3}, 4),
                arguments(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                arguments(new int[] {1, 1}, 1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] height, int excepted) {
        ContainerWithMostWater loop = new ContainerWithMostWaterLoop();
        assertEquals(excepted, loop.maxArea(height));
    }

    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(int[] height, int excepted) {
        ContainerWithMostWater pointer = new ContainerWithMostWaterPointer();
        assertEquals(excepted, pointer.maxArea(height));
    }
}
