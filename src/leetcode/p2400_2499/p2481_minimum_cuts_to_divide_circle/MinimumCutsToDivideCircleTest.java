package leetcode.p2400_2499.p2481_minimum_cuts_to_divide_circle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumCutsToDivideCircleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4, 2),
                arguments(3, 3),
                arguments(1, 0)
        );
    }

    @ParameterizedTest(name = "Divide {index}")
    @MethodSource("dataProvider")
    public void testDivide(int n, int expected) {
        MinimumCutsToDivideCircle divide = new
                MinimumCutsToDivideCircleDivide();
        assertEquals(expected, divide.numberOfCuts(n));
    }
}
