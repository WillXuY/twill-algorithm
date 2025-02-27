package org.willxu.algorithm.service.integer;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ShortestSubarrayToBeRemovedToMakeArraySortedTwoPointers;

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
	public void testTwoPointers(int[] arr, int excepted) {
		ShortestSubarrayToBeRemovedToMakeArraySorted twoPointers =
				new ShortestSubarrayToBeRemovedToMakeArraySortedTwoPointers();
		assertEquals(excepted, twoPointers.findLengthOfShortestSubarray(arr));
	}
}
