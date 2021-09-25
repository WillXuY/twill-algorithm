package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.IslandPerimeterRemovePublicEdge;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IslandPerimeterTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {0, 1, 0, 0},
                                {1, 1, 1, 0},
                                {0, 1, 0, 0},
                                {1, 1, 0, 0}
                        },
                        16
                ),
                arguments(
                        new int[][] {{1}},
                        4
                ),
                arguments(
                        new int[][] {{1, 0}},
                        4
                )
        );
    }

    @ParameterizedTest(name = "Remove public edge {index}")
    @MethodSource("dataProvider")
    public void testRemovePublicEdge(int[][] grid, int excepted) {
        IslandPerimeter edge = new IslandPerimeterRemovePublicEdge();
        assertEquals(excepted, edge.islandPerimeter(grid));
    }
}
