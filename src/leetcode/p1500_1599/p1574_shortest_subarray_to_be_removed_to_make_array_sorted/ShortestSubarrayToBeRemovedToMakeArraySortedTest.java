package leetcode.p1500_1599.p1574_shortest_subarray_to_be_removed_to_make_array_sorted;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ShortestSubarrayToBeRemovedToMakeArraySortedTest {
	static Stream<Arguments> dataProvider() {
		return Stream.of(
				arguments(new int[] {1, 2, 3, 10, 4, 2, 3, 5}, 3),
				arguments(new int[] {5, 4, 3, 2, 1}, 4),
				arguments(new int[] {1, 2, 3}, 0)
		);
	}

	@ParameterizedTest(name = "TwoPointers {index}")
	@MethodSource("dataProvider")
	public void testTwoPointers(int[] arr, int expected) {
		ShortestSubarrayToBeRemovedToMakeArraySorted twoPointers =
				new ShortestSubarrayToBeRemovedToMakeArraySortedTwoPointers();
		assertEquals(expected, twoPointers.findLengthOfShortestSubarray(arr));
	}
}
