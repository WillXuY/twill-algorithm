package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ProjectionAreaOf3dShapesCalculation;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ProjectionAreaOf3dShapesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                 * max(3, 1) + max(4, 2) = 7
                 * max(2, 1) + max(4, 3) = 6
                 * count grid(>0) = 4
                 */
                arguments(new int[][] {{1, 2}, {3, 4}}, 17),
                arguments(new int[][] {{2}}, 5),
                arguments(new int[][] {{1, 0}, {0, 2}}, 8),
                arguments(new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}, 14),
                arguments(new int[][] {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}, 21)
        );
    }

    @ParameterizedTest(name = "Calculation {index}")
    @MethodSource("dataProvider")
    public void testCalculation(int[][] grid, int expected) {
        ProjectionAreaOf3dShapes calculation =
                new ProjectionAreaOf3dShapesCalculation();
        assertEquals(expected, calculation.projectionArea(grid));
    }
}
