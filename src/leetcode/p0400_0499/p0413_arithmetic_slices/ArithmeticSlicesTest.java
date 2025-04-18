package leetcode.p0400_0499.p0413_arithmetic_slices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticSlicesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 2, 3, 4}, 3),
                Arguments.arguments(new int[] {1}, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int expected) {
        ArithmeticSlices loop = new ArithmeticSlicesLoop();
        assertEquals(expected, loop.numberOfArithmeticSlices(nums));
    }
}
