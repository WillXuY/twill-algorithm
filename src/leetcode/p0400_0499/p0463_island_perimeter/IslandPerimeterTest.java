package leetcode.p0400_0499.p0463_island_perimeter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IslandPerimeterTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // TODO Wrong answer 1
                arguments(
                        new int[][] {
                                {1},
                                {1},
                                {1},
                                {0},
                                {1},
                                {1}
                        },
                        8
                ),
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
    public void testRemovePublicEdge(int[][] grid, int expected) {
        IslandPerimeter edge = new IslandPerimeterRemovePublicEdge();
        assertEquals(expected, edge.islandPerimeter(grid));
    }
}
