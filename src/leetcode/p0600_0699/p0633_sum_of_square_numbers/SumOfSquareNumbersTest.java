package leetcode.p0600_0699.p0633_sum_of_square_numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfSquareNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(0, true),
                Arguments.arguments(5, true),
                Arguments.arguments(3, false)
        );
    }

    @ParameterizedTest(name = "Sqrt {index}")
    @MethodSource("dataProvider")
    public void testSqrt(int c, boolean expected) {
        SumOfSquareNumbers sqrt = new SumOfSquareNumbersSqrt();
        assertEquals(expected, sqrt.judgeSquareSum(c));
    }
}
