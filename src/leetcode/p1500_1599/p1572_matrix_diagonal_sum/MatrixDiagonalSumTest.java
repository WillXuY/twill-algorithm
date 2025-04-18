package leetcode.p1500_1599.p1572_matrix_diagonal_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MatrixDiagonalSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        },
                        25
                ),
                arguments(
                        new int[][] {
                                {1, 1, 1, 1},
                                {1, 1, 1, 1},
                                {1, 1, 1, 1},
                                {1, 1, 1, 1}
                        },
                        8
                ),
                arguments(new int[][] {{5}}, 5)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] mat, int expected) {
        MatrixDiagonalSum loop = new MatrixDiagonalSumLoop();
        assertEquals(expected, loop.diagonalSum(mat));
    }
}
