package leetcode.p2400_2499.p2451_odd_string_difference;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class OddStringDifferenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"adc", "wzy", "abc"}, "abc"),
                arguments(new String[] {"aaa", "bob", "ccc", "ddd"}, "bob")
        );
    }

    @ParameterizedTest(name = "Compare {index}")
    @MethodSource("dataProvider")
    public void testCompare(String[] words, String expected) {
        OddStringDifference compare = new OddStringDifferenceCompare();
        assertEquals(expected, compare.oddString(words));
    }
}
