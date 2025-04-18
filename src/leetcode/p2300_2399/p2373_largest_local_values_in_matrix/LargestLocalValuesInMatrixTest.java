package leetcode.p2300_2399.p2373_largest_local_values_in_matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestLocalValuesInMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][]{
                                {9, 9, 8, 1},
                                {5, 6, 2, 6},
                                {8, 2, 6, 4},
                                {6, 2, 2, 2}
                        },
                        new int[][] {{9, 9}, {8, 6}}
                ),
                arguments(
                        new int[][] {
                                {1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 1},
                                {1, 1, 2, 1, 1},
                                {1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 1}
                        },
                        new int[][] {
                                {2, 2, 2},
                                {2, 2, 2},
                                {2, 2, 2}
                        }
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] grid, int[][] expected) {
        LargestLocalValuesInMatrix loop = new LargestLocalValuesInMatrixLoop();
        assertArrayEquals(expected, loop.largestLocal(grid));
    }
}
