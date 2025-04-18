package leetcode.p0300_0399.p0371_sum_of_two_integers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfTwoIntegersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(1, 2, 3),
                Arguments.arguments(2, 3, 5)
        );
    }

    @ParameterizedTest(name = "Bit {index}")
    @MethodSource("dataProvider")
    public void testBit(int a, int b, int expected) {
        SumOfTwoIntegers bit = new SumOfTwoIntegersBit();
        assertEquals(expected, bit.getSum(a, b));
    }
}
