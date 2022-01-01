package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SurfaceAreaOf3dShapesSubtract;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SurfaceAreaOf3dShapesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1:
                arguments(new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}, 32),
                arguments(new int[][] {{1, 2}, {3, 4}}, 34),
                arguments(new int[][] {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}, 46)
        );
    }

    @ParameterizedTest(name = "Subtract {index}")
    @MethodSource("dataProvider")
    public void testSubtract(int[][] grid, int excepted) {
        SurfaceAreaOf3dShapes subtract = new SurfaceAreaOf3dShapesSubtract();
        assertEquals(excepted, subtract.surfaceArea(grid));
    }
}
