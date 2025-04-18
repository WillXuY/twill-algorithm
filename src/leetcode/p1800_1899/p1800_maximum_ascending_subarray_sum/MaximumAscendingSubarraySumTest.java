package leetcode.p1800_1899.p1800_maximum_ascending_subarray_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumAscendingSubarraySumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {10}, 10),
                arguments(new int[] {10, 20, 30, 5, 10, 50}, 65),
                arguments(new int[] {10, 20, 30, 40, 50}, 150),
                arguments(new int[] {12, 17, 15, 13, 10, 11, 12}, 33)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int expected) {
        MaximumAscendingSubarraySum count =
                new MaximumAscendingSubarraySumCount();
        assertEquals(expected, count.maxAscendingSum(nums));
    }
}
