package leetcode.p0400_0499.p0405_converta_number_to_hexadecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertaNumberToHexadecimalTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1:
                Arguments.arguments(0, "0"),
                Arguments.arguments(26, "1a"),
                Arguments.arguments(-1, "ffffffff")
        );
    }

    @ParameterizedTest(name = "Remainder {index}")
    @MethodSource("dataProvider")
    public void testRemainder(int input, String expected) {
        ConvertaNumberToHexadecimal remainder =
                new ConvertaNumberToHexadecimalRemainder();
        assertEquals(expected, remainder.toHex(input));
    }

    /**
     * -1 = -(0B0);
     * -2 = -(0B1);
     */
    @Test
    public void testHex() {
        for (int i = 10; i > -10; i--) {
            System.out.println(Integer.toHexString(i));
        }
    }
}
