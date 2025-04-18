package leetcode.p2200_2299.p2224_minimum_number_of_operations_to_convert_time;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumNumberOfOperationsToConvertTimeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("02:30", "04:35", 3),
                arguments("11:00", "11:01", 1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String current, String correct, int expected) {
        MinimumNumberOfOperationsToConvertTime loop =
                new MinimumNumberOfOperationsToConvertTimeLoop();
        assertEquals(expected, loop.convertTime(current, correct));
    }
}
