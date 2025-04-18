package leetcode.p1600_1699.p1605_find_valid_matrix_given_row_and_column_sums;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindValidMatrixGivenRowAndColumnSumsTest {
	static Stream<Arguments> dataProvider() {
		return Stream.of(
				arguments(
						new int[] {3, 8}, new int[] {4, 7},
						new int[][] {
							{3, 0},
							{1, 7}
						}
				),
				arguments(
						new int[] {5, 7, 10}, new int[] {8, 6, 8},
						new int[][] {
							{5, 0, 0},
						    {3, 4, 0},
							{0, 2, 8}
						}
				)
		);
	}

	@ParameterizedTest(name = "Compare {index}")
	@MethodSource("dataProvider")
	public void testCompare(int[] rowSum, int[] colSum, int[][] expected) {
		FindValidMatrixGivenRowAndColumnSums compare = new FindValidMatrixGivenRowAndColumnSumsCompare();
		assertArrayEquals(expected, compare.restoreMatrix(rowSum, colSum));;
	}
}
