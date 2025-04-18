package leetcode.p0800_0899.p0807_max_increase_to_keep_city_skyline;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxIncreaseToKeepCitySkylineTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[][] {
                                {3, 0, 8, 4},
                                {2, 4, 5, 7},
                                {9, 2, 6, 3},
                                {0, 3, 1, 0}
                        },
                        35
                ),
                Arguments.arguments(
                        new int[][]{
                                {0, 0, 0},
                                {0, 0, 0},
                                {0, 0, 0}
                        },
                        0
                )
        );
    }

    @ParameterizedTest(name  = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] grid, int expected) {
        MaxIncreaseToKeepCitySkyline loop =
                new MaxIncreaseToKeepCitySkylineLoop();
        assertEquals(expected, loop.maxIncreaseKeepingSkyline(grid));
    }
}
