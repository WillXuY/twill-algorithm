package leetcode.p1300_1399.p1344_angle_between_hands_of_clock;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AngleBetweenHandsOfClockTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(12, 30, 165),
                Arguments.arguments(3, 30, 75),
                Arguments.arguments(3, 15, 7.5)
        );
    }

    @ParameterizedTest(name = "Calculate {index}")
    @MethodSource("dataProvider")
    public void testCalculate(int hour, int minute, double expected) {
        AngleBetweenHandsOfClock calculate =
                new AngleBetweenHandsOfClockCalculate();
        assertEquals(expected, calculate.angleClock(hour, minute));
    }
}
