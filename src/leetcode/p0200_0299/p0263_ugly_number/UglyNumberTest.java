package leetcode.p0200_0299.p0263_ugly_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UglyNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // zero is false
                arguments(0, false),
                // 2 x 3
                arguments(6, true),
                // 2 x 2 x 2
                arguments(8, true),
                // 7 is false
                arguments(14, false),
                /*
                1 has no prime factors, therefore all of its prime
                factors are limited to 2, 3, and 5.
                 */
                arguments(1, true)
        );
    }

    @ParameterizedTest(name = "Divide {index}")
    @MethodSource("dataProvider")
    public void testDivide(int input, boolean expected) {
        UglyNumber divide = new UglyNumberDivide();
        assertEquals(expected, divide.isUgly(input));
    }
}
