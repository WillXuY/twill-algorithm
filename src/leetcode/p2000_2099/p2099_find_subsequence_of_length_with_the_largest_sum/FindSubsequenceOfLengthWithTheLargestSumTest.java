package leetcode.p2000_2099.p2099_find_subsequence_of_length_with_the_largest_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindSubsequenceOfLengthWithTheLargestSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {50, -75}, 2, new int[] {50, -75}),
                arguments(new int[] {2, 1, 3, 3}, 2, new int[] {3, 3}),
                arguments(new int[] {-1, -2, 3, 4}, 3, new int[] {-1, 3, 4}),
                arguments(new int[] {3, 4, 3, 3}, 2, new int[] {3, 4})
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] nums, int k, int[] expected) {
        FindSubsequenceOfLengthWithTheLargestSum sort =
                new FindSubsequenceOfLengthWithTheLargestSumSort();
        assertArrayEquals(expected, sort.maxSubsequence(nums, k));
    }
}
