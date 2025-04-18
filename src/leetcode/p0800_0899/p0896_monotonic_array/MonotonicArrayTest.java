package leetcode.p0800_0899.p0896_monotonic_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MonotonicArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 2, 3}, true),
                arguments(new int[] {6, 5, 4, 4}, true),
                arguments(new int[] {1, 3, 2}, false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, boolean expected) {
        MonotonicArray loop = new MonotonicArrayLoop();
        assertEquals(expected, loop.isMonotonic(nums));
    }
}
