package leetcode.p2100_2199.p2176_count_equal_and_divisible_pairs_in_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountEqualAndDivisiblePairsInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {10,2,3,4,9,6,3,10,3,6,3,9,1}, 4, 8),
                arguments(new int[] {3, 1, 2, 2, 2, 1, 3}, 2, 4),
                arguments(new int[] {1, 2, 3, 4}, 1, 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int k, int expected) {
        CountEqualAndDivisiblePairsInAnArray count =
                new CountEqualAndDivisiblePairsInAnArrayCount();
        assertEquals(expected, count.countPairs(nums, k));
    }
}
