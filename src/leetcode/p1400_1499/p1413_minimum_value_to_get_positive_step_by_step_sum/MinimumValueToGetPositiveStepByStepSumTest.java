package leetcode.p1400_1499.p1413_minimum_value_to_get_positive_step_by_step_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumValueToGetPositiveStepByStepSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {-3, 2, -3, 4, 2}, 5),
                arguments(new int[] {1, 2}, 1),
                arguments(new int[] {1, -2, -3}, 5)
        );
    }

    @ParameterizedTest(name = "Min {index}")
    @MethodSource("dataProvider")
    public void testMin(int[] nums, int expected) {
        MinimumValueToGetPositiveStepByStepSum min =
                new MinimumValueToGetPositiveStepByStepSumMin();
        assertEquals(expected, min.minStartValue(nums));
    }
}
