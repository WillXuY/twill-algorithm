package leetcode.p1500_1599.p1577_number_of_ways_where_square_of_number_is_equal_to_product_of_two_numbers;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbersTest {
	static Stream<Arguments> dataProvider() {
		return Stream.of(
				arguments(new int[] {7, 4}, new int[] {5, 2, 8, 9}, 1),
				arguments(new int[] {1, 1}, new int[] {1, 1, 1}, 9),
				arguments(new int[] {7, 7, 8, 3}, new int[] {1, 2, 9, 7}, 2)
		);
	}
	
	@ParameterizedTest(name = "Map {index}")
	@MethodSource("dataProvider")
	public void testMap(int[] num1, int[] num2, int expected) {
		NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers map =
				new NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbersMap();
		assertEquals(expected, map.numTriplets(num1, num2));
	}
}
