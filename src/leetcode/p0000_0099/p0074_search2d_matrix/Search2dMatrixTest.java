package leetcode.p0000_0099.p0074_search2d_matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Search2dMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1}, {3}}, 3, true),
                arguments(new int[][] {{1, 3}}, 3, true),
                arguments(new int[][] {{1}}, 1, true),
                arguments(
                        new int[][] {
                                {1, 3, 5, 7},
                                {10, 11, 16, 20},
                                {23, 30, 34, 60}
                        },
                        3,
                        true
                ),
                arguments(
                        new int[][] {
                                {1, 3, 5, 7},
                                {10, 11, 16, 20},
                                {23, 30, 34, 60}
                        },
                        13,
                        false
                )
        );
    }

    @ParameterizedTest(name = "Half {index}")
    @MethodSource("dataProvider")
    public void testHalf(int[][] matrix, int target, boolean expected) {
        Search2dMatrix half = new Search2dMatrixHalf();
        assertEquals(expected, half.searchMatrix(matrix, target));
    }
}
