package leetcode.p1400_1499.p1403_minimum_subsequence_in_non_increasing_order;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumSubsequenceInNonIncreasingOrderTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {4, 3, 10, 9, 8},
                        Stream.of(10, 9).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {4, 4, 7, 6, 7},
                        Stream.of(7, 7, 6).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {6},
                        Stream.of(6).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, List<Integer> expected) {
        MinimumSubsequenceInNonIncreasingOrder count =
                new MinimumSubsequenceInNonIncreasingOrderCount();
        assertArrayEquals(
                expected.toArray(), count.minSubsequence(nums).toArray());
    }
}
