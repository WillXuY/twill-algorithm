package leetcode.p0000_0099.p0063_unique_paths_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UniquePathsIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {0, 0},
                                {1, 1},
                                {0, 0}
                        },
                        0
                ),
                arguments(
                        new int[][] {{0, 0}, {0, 1}},
                        0
                ),
                arguments(
                        new int[][] {{1, 0}},
                        0
                ),
                arguments(
                        new int[][] {
                                {0, 0, 0},
                                {0, 1, 0},
                                {0, 0, 0}
                        },
                        2
                ),
                arguments(
                        new int[][] {
                                {0, 1},
                                {0, 0}
                        },
                        1
                )
        );
    }

    @ParameterizedTest(name = "Grid {index}")
    @MethodSource("dataProvider")
    public void testGrid(int[][] obstacleGrid, int expected) {
        UniquePathsIi grid = new UniquePathsIiGrid();
        assertEquals(expected, grid.uniquePathsWithObstacles(obstacleGrid));
    }
}
