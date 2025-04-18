package leetcode.p1300_1399.p1343_number_of_sub_arrays_of_size_and_average_greater_than_or_equal_to_threshold;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThresholdTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {2, 2, 2, 2, 5, 5, 5, 8},
                        3, 4, 3
                ),
                Arguments.arguments(
                        new int[] {11,13,17,23,29,31,7,5,2,3},
                        3, 5, 6
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] arr, int k, int threshold, int expected) {
        NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThreshold loop =
                new NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThresholdLoop();
        assertEquals(expected, loop.numOfSubarrays(arr, k, threshold));
    }
}
