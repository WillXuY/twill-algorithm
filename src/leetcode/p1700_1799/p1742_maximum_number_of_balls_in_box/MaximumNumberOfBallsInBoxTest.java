package leetcode.p1700_1799.p1742_maximum_number_of_balls_in_box;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumNumberOfBallsInBoxTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(1, 10, 2),
                arguments(5, 15, 2),
                arguments(19, 28, 2)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int lowLimit, int highLimit, int expected) {
        MaximumNumberOfBallsInBox count = new MaximumNumberOfBallsInBoxCount();
        assertEquals(expected, count.countBalls(lowLimit, highLimit));
    }
}
