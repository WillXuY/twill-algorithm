package leetcode.p1300_1399.p1337_the_weakest_rows_in_matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TheWeakestRowsInMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {1, 1, 0, 0, 0},
                                {1, 1, 1, 1, 0},
                                {1, 0, 0, 0, 0},
                                {1, 1, 0, 0, 0},
                                {1, 1, 1, 1, 1}
                        }, 3,
                        new int[] {2, 0, 3}
                ),
                arguments(
                        new int[][] {
                                {1, 0, 0, 0},
                                {1, 1, 1, 1},
                                {1, 0, 0, 0},
                                {1, 0, 0, 0}
                        }, 2,
                        new int[] {0, 2}
                )
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[][] mat, int k, int[] expected) {
        TheWeakestRowsInMatrix sort = new TheWeakestRowsInMatrixSort();
        assertArrayEquals(expected, sort.kWeakestRows(mat, k));
    }
}
