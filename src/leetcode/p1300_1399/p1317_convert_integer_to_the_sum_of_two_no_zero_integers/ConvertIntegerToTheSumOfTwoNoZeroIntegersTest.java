package leetcode.p1300_1399.p1317_convert_integer_to_the_sum_of_two_no_zero_integers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. forget the first 1.
                arguments(19, new int[] {4, 15}),
                arguments(2, new int[] {1, 1}),
                arguments(11, new int[] {5, 6})
        );
    }

    @ParameterizedTest(name = "Divide2 {index}")
    @MethodSource("dataProvider")
    public void testDivide2(int n, int[] expected) {
        ConvertIntegerToTheSumOfTwoNoZeroIntegers divide2
                = new ConvertIntegerToTheSumOfTwoNoZeroIntegersDivide2();
        assertArrayEquals(expected, divide2.getNoZeroIntegers(n));
    }
}
