package leetcode.p2400_2499.p2496_maximum_value_of_string_in_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumValueOfStringInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"alic3", "bob", "3", "4", "00000"}, 5),
                arguments(new String[] {"1", "01", "001", "0001"}, 1)
        );
    }

    @ParameterizedTest(name = "Parse {index}")
    @MethodSource("dataProvider")
    public void testParse(String[] strs, int expected) {
        MaximumValueOfStringInAnArray parse =
                new MaximumValueOfStringInAnArrayParse();
        assertEquals(expected, parse.maximumValue(strs));
    }
}
