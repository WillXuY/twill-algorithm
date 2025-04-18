package leetcode.p2400_2499.p2437_number_of_valid_clock_times;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfValidClockTimesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("?5:00", 2),
                arguments("0?:0?", 100),
                arguments("??:??", 1440)
        );
    }

    @ParameterizedTest(name = "If {index}")
    @MethodSource("dataProvider")
    public void testIf(String time, int expected) {
        NumberOfValidClockTimes timesIf = new NumberOfValidClockTimesIf();
        assertEquals(expected, timesIf.countTime(time));
    }
}
