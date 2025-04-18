package leetcode.p1800_1899.p1827_minumum_operations_to_make_the_array_increasing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import leetcode.p1800_1899.p1827_minumum_operations_to_make_the_array_increasing.MinimumOperationsToMakeTheArrayIncreasingLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumOperationsToMakeTheArrayIncreasingTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 1, 1}, 3),
                arguments(new int[] {1, 5, 2, 4, 1}, 14),
                arguments(new int[] {8}, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int expected) {
        MinimumOperationsToMakeTheArrayIncreasing loop =
                new MinimumOperationsToMakeTheArrayIncreasingLoop();
        assertEquals(expected, loop.minOperations(nums));
    }
}
