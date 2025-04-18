package leetcode.p0000_0099.p0029_divide_two_integers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DivideTwoIntegersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(1, 2, 0),
                // Time limit exceeded
                arguments(2147483647, 1, 2147483647),
                arguments(1, 1, 1),
                arguments(Integer.MIN_VALUE, -1, Integer.MAX_VALUE),
                arguments(10, 3, 3),
                arguments(7, -3, -2)
        );
    }

    @ParameterizedTest(name = "Left {index}")
    @MethodSource("dataProvider")
    public void testLeft(int dividend, int divisor, int expected) {
        DivideTwoIntegers left = new DivideTwoIntegersLeft();
        assertEquals(expected, left.divide(dividend, divisor));
    }

    @ParameterizedTest(name = "Subtraction {index}")
    @MethodSource("dataProvider")
    public void testSubtraction(int dividend, int divisor, int expected) {
        DivideTwoIntegers subtraction = new DivideTwoIntegersSubtraction();
        assertEquals(expected, subtraction.divide(dividend, divisor));
    }
}
