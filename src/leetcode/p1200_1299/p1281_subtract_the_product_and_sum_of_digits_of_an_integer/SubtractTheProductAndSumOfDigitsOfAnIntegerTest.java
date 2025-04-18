package leetcode.p1200_1299.p1281_subtract_the_product_and_sum_of_digits_of_an_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 2 * 3 * 4 = 24, 2 + 3 + 4 = 9, 24 - 9 = 5
                arguments(234, 15),
                arguments(4421, 21)
        );
    }

    @ParameterizedTest(name = "Division {index}")
    @MethodSource("dataProvider")
    public void testDivision(int n, int expected) {
        SubtractTheProductAndSumOfDigitsOfAnInteger division
                = new SubtractTheProductAndSumOfDigitsOfAnIntegerDivision();
        assertEquals(expected, division.subtractProductAndSum(n));
    }
}
