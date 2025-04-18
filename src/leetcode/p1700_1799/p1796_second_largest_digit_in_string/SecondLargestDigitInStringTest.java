package leetcode.p1700_1799.p1796_second_largest_digit_in_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SecondLargestDigitInStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("dfa12321afd", 2),
                arguments("abc1111", -1)
        );
    }

    /**
     * better use if check value instead of set.
     */
    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String s, int expected) {
        SecondLargestDigitInString set = new SecondLargestDigitInStringSet();
        assertEquals(expected, set.secondHighest(s));
    }
}
