package leetcode.p2000_2099.p2006_count_number_of_pairs_with_absolute_difference;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountNumberOfPairsWithAbsoluteDifferenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 2, 1}, 1, 4),
                arguments(new int[] {1, 3}, 3, 0),
                arguments(new int[] {3, 2, 1, 5, 4}, 2, 3)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int k, int expected) {
        CountNumberOfPairsWithAbsoluteDifference count =
                new CountNumberOfPairsWithAbsoluteDifferenceCount();
        assertEquals(expected, count.countKDifference(nums, k));
    }
}
