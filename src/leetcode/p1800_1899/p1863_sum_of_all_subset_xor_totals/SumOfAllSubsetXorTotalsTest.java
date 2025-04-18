package leetcode.p1800_1899.p1863_sum_of_all_subset_xor_totals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SumOfAllSubsetXorTotalsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {5, 1, 6}, 28),
                arguments(new int[] {1, 3}, 6),
                arguments(new int[] {3, 4, 5, 6, 7, 8}, 480)
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int[] nums, int expected) {
        SumOfAllSubsetXorTotals recursive =
                new SumOfAllSubsetXorTotalsRecursive();
        assertEquals(expected, recursive.subsetXORSum(nums));
    }
}
