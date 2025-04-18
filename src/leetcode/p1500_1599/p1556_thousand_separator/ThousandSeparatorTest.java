package leetcode.p1500_1599.p1556_thousand_separator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ThousandSeparatorTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(123456789, "123.456.789"),
                arguments(1000, "1.000"),
                arguments(987, "987"),
                arguments(1234, "1.234")
        );
    }

    @ParameterizedTest(name = "Character {index}")
    @MethodSource("dataProvider")
    public void testCharacter(int n, String expected) {
        ThousandSeparator character = new ThousandSeparatorCharacter();
        assertEquals(expected, character.thousandSeparator(n));
    }
}
