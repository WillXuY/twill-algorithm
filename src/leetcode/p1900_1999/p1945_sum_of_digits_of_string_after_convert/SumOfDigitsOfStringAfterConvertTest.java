package leetcode.p1900_1999.p1945_sum_of_digits_of_string_after_convert;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SumOfDigitsOfStringAfterConvertTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("iiii", 1, 36),
                arguments("leetcode", 2, 6),
                arguments("zbax", 2, 8)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int k, int expected) {
        SumOfDigitsOfStringAfterConvert loop =
                new SumOfDigitsOfStringAfterConvertLoop();
        assertEquals(expected, loop.getLucky(s, k));
    }
}
