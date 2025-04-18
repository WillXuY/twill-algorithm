package leetcode.p1700_1799.p1736_latest_time_by_replacing_hidden_digits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LatestTimeByReplacingHiddenDigitsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("??:3?", "23:39"),
                arguments("?4:03", "14:03"),
                arguments("2?:?0", "23:50"),
                arguments("0?:3?", "09:39"),
                arguments("1?:22", "19:22")
        );
    }

    @ParameterizedTest(name = "Step {index}")
    @MethodSource("dataProvider")
    public void testStep(String time, String expected) {
        LatestTimeByReplacingHiddenDigits step =
                new LatestTimeByReplacingHiddenDigitsStep();
        assertEquals(expected, step.maximumTime(time));
    }
}
