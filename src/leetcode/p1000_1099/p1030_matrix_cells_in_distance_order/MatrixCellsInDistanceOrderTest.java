package leetcode.p1000_1099.p1030_matrix_cells_in_distance_order;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MatrixCellsInDistanceOrderTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        1, 2, 0, 0,
                        new int[][] {
                                {0, 0},
                                {0, 1}
                        }
                ),
                arguments(
                        2, 2, 0, 1,
                        new int[][] {
                                {0, 1},
                                {0, 0},
                                {1, 1},
                                {1, 0}
                        }
                ),
                arguments(
                        2, 3, 1, 2,
                        new int[][] {
                                {1, 2},
                                {1, 1},
                                {0, 2},
                                {1, 0},
                                {0, 1},
                                {0, 0}
                        }
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int r, int c, int rc, int cc, int[][] expected) {
        MatrixCellsInDistanceOrder loop = new MatrixCellsInDistanceOrderLoop();
        assertArrayEquals(expected, loop.allCellsDistOrder(r, c, rc, cc));
    }
}
