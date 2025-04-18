package leetcode.p0000_0099.p0012_integer_to_roman;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IntegerToRomanTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(3, "III"),
                arguments(58, "LVIII"),
                arguments(1994, "MCMXCIV")
        );
    }

    @ParameterizedTest(name = "Flow {index}")
    @MethodSource("dataProvider")
    public void testFlow(int num, String expected) {
        IntegerToRoman flow = new IntegerToRomanFlow();
        assertEquals(expected, flow.intToRoman(num));
    }
}
