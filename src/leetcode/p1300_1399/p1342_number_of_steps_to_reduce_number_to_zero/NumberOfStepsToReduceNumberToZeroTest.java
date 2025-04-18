package leetcode.p1300_1399.p1342_number_of_steps_to_reduce_number_to_zero;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfStepsToReduceNumberToZeroTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 14 -> 7 -> 6 -> 3 -> 2 -> 1 -> 0
                arguments(14, 6),
                // 8, 4, 2, 1, 0
                arguments(8, 4),
                arguments(123, 12)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int num, int expected) {
        NumberOfStepsToReduceNumberToZero loop
                = new NumberOfStepsToReduceNumberToZeroLoop();
        assertEquals(expected, loop.numberOfSteps(num));
    }
}
